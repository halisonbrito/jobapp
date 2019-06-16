package edu.mum.services;

import edu.mum.entities.JobApplication;
import edu.mum.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    Long add(Student student);
    void delete(Long id);
    Long update(Student student);
    Student get(Long id);
}
