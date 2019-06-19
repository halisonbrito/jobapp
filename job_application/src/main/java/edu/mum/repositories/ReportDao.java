package edu.mum.repositories;

import edu.mum.entities.Report;
import edu.mum.entities.ReportStudent;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ReportDao {
    @PersistenceContext
    EntityManager em;
    @Resource
    IStudentDao studentDao;

    public List<Report> getReport(){
        List<Report> reports = em.createQuery(
                "select new edu.mum.entities.Report(c.id, c.name, c.description, count(app.student), avg (app.salary), max(app.salary)) " +
                        "from Company c " +
                        "left outer join c.appls app where app.approved = true group by c.id").getResultList();
        reports.forEach(r->{
            r.getStudentList().addAll(findReportStudents(r.getCompanyId()));
        });
        return reports;
    }

    public List<ReportStudent> findReportStudents(Long id){
        Query query = em.createQuery("select new edu.mum.entities.ReportStudent(s.name, s.entry, app.salary) from JobApplication app " +
                "join app.student s where app.company.id = :id");
        query.setParameter("id", id);
        return query.getResultList();
    }
}
