package mum.edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.dto.Reference;
import mum.edu.services.ReferenceService;

@RestController
public class ReferenceController {
	
	@Autowired
	private ReferenceService service;
	
	@GetMapping("/references/{studentId}")
	public List<Reference> find(@PathVariable Long studentId){
		return service.find(studentId);
	}
	
	@PostMapping("/references")
	public void save(@RequestBody Reference reference) {
		service.save(reference);
	}
	
	@PutMapping("/references")
	public void update(@RequestBody Reference reference) {
		service.update(reference);
	}
	
	@DeleteMapping("/references/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
