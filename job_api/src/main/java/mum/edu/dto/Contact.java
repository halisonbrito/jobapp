package mum.edu.dto;

import java.util.List;
import java.util.stream.Collectors;

public class Contact {
	
	private Long id;
	
	private String description;

	private Reference reference; 
	
	private List<ContactType> contactTypes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Reference getReference() {
		return reference;
	}

	public void setReference(Reference reference) {
		this.reference = reference;
	}

	public List<ContactType> getContactTypes() {
		return contactTypes;
	}

	public void setContactTypes(List<ContactType> contactTypes) {
		this.contactTypes = contactTypes.stream()
				.map( contactType -> {contactType.setContact(this); return contactType;} )
				.collect(Collectors.toList());
	}

}
