package mum.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.ConfigProperties;
import mum.edu.dto.Company;

@Service
public class CompanyService implements ICompanyService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConfigProperties config;

	private String getUrlServiceCompany() {
		return config.getHostJobApp()+":"+config.getPortServiceJobApp()+"/companies/";
	}
	
    public List<Company> getAll() {
		ResponseEntity<List<Company>> response =
				restTemplate.exchange(getUrlServiceCompany(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Company>>() {});
		
		return response.getBody();
    }

    public void save(Company company) {
		restTemplate.postForLocation(getUrlServiceCompany(), company);
    }

    public void delete(Long id) {
    	restTemplate.delete(getUrlServiceCompany()+"{id}",id);
    }

    public void update(Company company) {
    	restTemplate.put(getUrlServiceCompany(), company);
    }

    public Company get(Long id){
		return restTemplate.getForObject(getUrlServiceCompany()+"{id}", Company.class, id);
	}

}
