package mum.edu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mum.edu.entities.Reference;

public interface ReferenceDao extends JpaRepository<Reference, Long>{
	
	public List<Reference> findByStudentId(Long studentId);

}
