package mum.edu.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.dto.Reference;
import mum.edu.dto.Student;

@Service
public class StudentService {
	
	private final String urlStudents = "http://localhost:999/students/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ReferenceService referenceService;
	
	public List<Student> loadAllStudentsWithReferences(){
			
		List<Student> students = findAll().stream().map( student -> {
			student.setReferences( referenceService.find(student.getId()) );
			return student;
		}).collect(Collectors.toList());
		
		return students;
		
	}
	
	public List<Student> findAll(){
		ResponseEntity<List<Student>> response =
				restTemplate.exchange(urlStudents, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {});
		
		return response.getBody();
	}

	

}
