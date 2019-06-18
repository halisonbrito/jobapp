package mum.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.ConfigProperties;
import mum.edu.dto.Reference;

@Service
public class ReferenceService implements IReferenceService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ConfigProperties config;

	private String getUrlServiceReference() {
		return config.getHostReference()+":"+config.getPortServiceReference()+"/references/";
	}
	
	
	public List<Reference> find(Long studentId){
		ResponseEntity<List<Reference>> response =
				restTemplate.exchange(getUrlServiceReference()+"{id}", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Reference>>() {},studentId);
		
		return response.getBody();
	}
	
	public void save(Reference reference) {
		restTemplate.postForLocation(getUrlServiceReference(), reference);
	}

	public void update(Reference reference) {
		restTemplate.put(getUrlServiceReference(), reference);
	}
	
	
	public void delete(Long id) {
		restTemplate.delete(getUrlServiceReference()+"{id}",id);
	}
	
}
