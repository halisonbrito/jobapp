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
public class CompanyService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConfigProperties config;

	private String getUrlServiceCompany() {
		return config.getHostName()+":"+config.getPortServiceReferencia()+"/companies/";
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
    	restTemplate.delete(getUrlServiceCompany()+"{id}");
    }

    public void update(Company company) {
    	restTemplate.put(getUrlServiceCompany(), company);
    }

}
