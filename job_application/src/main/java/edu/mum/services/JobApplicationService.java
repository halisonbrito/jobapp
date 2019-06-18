package edu.mum.services;

import edu.mum.entities.Company;
import edu.mum.entities.JobApplication;
import edu.mum.entities.Student;
import edu.mum.repositories.ICompanyDao;
import edu.mum.repositories.IJobApplicationDao;
import edu.mum.repositories.IStudentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class JobApplicationService implements IJobApplicationService{
    @Resource
    private IJobApplicationDao jobApplicationDao;
    @Resource
    private IStudentService studentService;
    @Resource
    private ICompanyService companyService;

    @Override
    public List<JobApplication> getAllNames() {
        List<JobApplication> applications = jobApplicationDao.findAll();
        List<Student> students = studentService.getAll();
        List<Company> companies = companyService.getAll();
        applications.stream().forEach(app -> {
            Optional<Student> optional = students.stream().filter(s -> {
                if (s.getApplications().contains(app))
                    return true;
                return false;
            }).findAny();
            if (optional.isPresent())
                app.setStudentName(optional.get().getName());
        });
        applications.stream().forEach(app -> {
            Optional<Company> optional = companies.stream().filter(c -> {
                if (c.getAppls().contains(app))
                    return true;
                return false;
            }).findAny();
            if (optional.isPresent())
                app.setCompanyName(optional.get().getName());
        });
        return applications;
    }

    @Override
    public List<JobApplication> getAll() {
        return jobApplicationDao.findAll();
    }

    @Override
    public Long add(JobApplication jobApplication) {
        return jobApplicationDao.save(jobApplication).getId();
    }

    @Override
    public void delete(Long id) {
        jobApplicationDao.delete(get(id));
    }

    @Override
    public Long update(JobApplication jobApplication) {
        return jobApplicationDao.save(jobApplication).getId();
    }

    @Override
    public JobApplication get(Long id) {
        return jobApplicationDao.findById(id).get();
    }
}
