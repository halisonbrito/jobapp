package edu.mum.services;

import java.util.List;

import edu.mum.entities.JobApplication;

public interface IJobApplicationService {
    List<JobApplication> getAll();
    Long add(JobApplication jobApplication);
    void delete(Long id);
    Long update(JobApplication jobApplication);
    JobApplication get(Long id);
}
