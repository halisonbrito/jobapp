package mum.edu.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.dto.Reference;

@Service
public class ReferenceService {
	
	private final String urlId = "http://localhost:8080/references/{id}";
	private final String url = "http://localhost:8080/references/";
	
	private RestTemplate restTemplate;
	
	public List<Reference> find(Long studentId){
		
		ResponseEntity<List<Reference>> response =
				restTemplate.exchange(urlId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Person>>() {});
				return response.getBody();
		
		return restTemplate.getForObject(urlId, Reference.class, studentId);
	}
	
	public void save(Reference reference) {
		restTemplate.postForLocation(url, request);
	}

	public void update(Reference reference) {
		restTemplate.put(url, request);
	}
	
	
	public void delete(Long id) {
		dao.deleteById(id);
	}
	
}
