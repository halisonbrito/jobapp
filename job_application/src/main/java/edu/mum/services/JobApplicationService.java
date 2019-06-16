package edu.mum.services;

import edu.mum.entities.JobApplication;
import edu.mum.repositories.IJobApplicationDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class JobApplicationService implements IJobApplicationService{
    @Resource
    private IJobApplicationDao jobApplicationDao;

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
