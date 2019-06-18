package mum.edu.services;

import java.util.List;

import mum.edu.dto.Student;

public interface IStudentService {

	public List<Student> loadAllStudentsWithReferences();
	
	public List<Student> findAll();
	
    public Student get(Long id);
	
}
