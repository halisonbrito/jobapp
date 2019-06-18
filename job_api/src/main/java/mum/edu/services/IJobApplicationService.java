package mum.edu.services;

import java.util.List;

import mum.edu.dto.JobApplication;

public interface IJobApplicationService {

    public List<JobApplication> findAll();

    public void save(JobApplication jobApplication);
    
    public void update(JobApplication jobApplication);
    
    public void delete(Long id);
    
    public JobApplication get(Long id);
	
	
}
