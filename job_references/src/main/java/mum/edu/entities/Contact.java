package mum.edu.entities;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	
	@ManyToOne
	private Reference reference; 
	
	@OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,orphanRemoval = true)
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
