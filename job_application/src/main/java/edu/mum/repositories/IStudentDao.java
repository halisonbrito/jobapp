package edu.mum.repositories;

import edu.mum.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

public interface IStudentDao extends JpaRepository<Student, Long> {
}
