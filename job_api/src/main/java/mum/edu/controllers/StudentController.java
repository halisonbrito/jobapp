package mum.edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.dto.Student;
import mum.edu.services.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
	@GetMapping("/students")
	public List<Student> find(){
		return studentService.loadAllStudentsWithReferences();
	}

}
