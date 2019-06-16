package edu.mum.repositories;

import edu.mum.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student, Long> {

}
