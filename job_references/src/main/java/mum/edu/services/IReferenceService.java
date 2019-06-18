package mum.edu.services;

import java.util.List;

import mum.edu.entities.Reference;

public interface IReferenceService {

	public List<Reference> find(Long studentId);
	
	public void saveOrUpdate(Reference reference);
	
	public void delete(Long id);
	
}
