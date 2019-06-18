package edu.mum.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.entities.JobApplication;
import edu.mum.repositories.IJobApplicationDao;

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
