package edu.mum.services;

import edu.mum.entities.Company;
import edu.mum.entities.JobApplication;

import java.util.List;

public interface IJobApplicationService {
    List<JobApplication> getAll();
    List<JobApplication> getAllNames();
    Long add(JobApplication jobApplication);
    void delete(Long id);
    Long update(JobApplication jobApplication);
    JobApplication get(Long id);
}
