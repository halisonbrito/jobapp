package mum.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.dto.Reference;

@Service
public class ReferenceService {
	
	private final String urlId = "http://localhost:8080/references/{id}";
	private final String url = "http://localhost:8080/references/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Reference> find(Long studentId){
		
		ResponseEntity<List<Reference>> response =
				restTemplate.exchange(urlId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Reference>>() {},studentId);
		
		return response.getBody();
	}
	
	public void save(Reference reference) {
		restTemplate.postForLocation(url, reference);
	}

	public void update(Reference reference) {
		restTemplate.put(url, reference);
	}
	
	
	public void delete(Long id) {
		restTemplate.delete(urlId);
	}
	
}
