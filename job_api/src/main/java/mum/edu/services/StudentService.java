package mum.edu.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mum.edu.ConfigProperties;
import mum.edu.dto.Student;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ReferenceService referenceService;
	
	@Autowired
	private ConfigProperties config;

	private String getUrlServiceJobApp() {
		return config.getHostJobApp()+":"+config.getPortServiceJobApp()+"/students/";
	}
	
	public List<Student> loadAllStudentsWithReferences(){
		
		List<Student> students = findAll().stream().map( student -> {
			student.setReferences( referenceService.find(student.getId()) );
			return student;
		}).collect(Collectors.toList());
		
		return students;
		
	}
	
	public List<Student> findAll(){
		ResponseEntity<List<Student>> response =
				restTemplate.exchange(getUrlServiceJobApp(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {});
		
		return response.getBody();
	}
	
	
    public Student get(Long id){
		return restTemplate.getForObject(getUrlServiceJobApp()+"{id}", Student.class, id);
	}

}
