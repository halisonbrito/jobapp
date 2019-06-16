package mum.edu.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.entities.Reference;
import mum.edu.repositories.ReferenceDao;

@Service
@Transactional
public class ReferenceService {

	@Autowired
	private ReferenceDao dao;
	
	public List<Reference> find(Long studentId){
		return dao.findByStudentId(studentId); 
	}
	
	public void saveOrUpdate(Reference reference) {
		dao.save(reference);
	}
	
	public void delete(Long id) {
		dao.deleteById(id);
	}
	
}
