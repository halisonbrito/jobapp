package mum.edu.services;

import java.util.List;

import mum.edu.dto.Reference;

public interface IReferenceService {

	public List<Reference> find(Long studentId);
	
	public void save(Reference reference);

	public void update(Reference reference);
	
	public void delete(Long id);
	
}
