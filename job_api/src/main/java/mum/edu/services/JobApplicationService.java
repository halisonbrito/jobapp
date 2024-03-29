package mum.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.ConfigProperties;
import mum.edu.dto.JobApplication;

@Service
public class JobApplicationService implements IJobApplicationService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConfigProperties config;
	
	private String getUrlServiceApplications() {
		return config.getHostJobApp()+":"+config.getPortServiceJobApp()+"/applications/";
	}
	
    public List<JobApplication> findAll() {
		ResponseEntity<List<JobApplication>> response =
				restTemplate.exchange(getUrlServiceApplications(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<JobApplication>>() {});
		
		return response.getBody();
    }

    public void save(JobApplication jobApplication) {
    	restTemplate.postForLocation(getUrlServiceApplications(), jobApplication);
    }

    public void update(JobApplication jobApplication) {
    	restTemplate.put(getUrlServiceApplications(), jobApplication);
    }
    
    public void delete(Long id) {
    	restTemplate.delete(getUrlServiceApplications()+"{id}",id);
    }
    
    public JobApplication get(Long id){
		return restTemplate.getForObject(getUrlServiceApplications()+"{id}", JobApplication.class, id);
	}
    
    

}
