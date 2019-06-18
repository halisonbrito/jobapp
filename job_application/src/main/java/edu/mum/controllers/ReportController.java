package edu.mum.controllers;

import edu.mum.entities.Report;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @PersistenceContext
    EntityManager em;

    @GetMapping
    List<Report> getReport(){
        List<Report> reports = em.createQuery(
                "select new edu.mum.entities.Report(c.name, c.description, count(app.student), avg (app.salary)) " +
                "from Company c " +
                "left outer join c.appls app where app.approved = true group by c.id").getResultList();
        return reports;
    }
}
