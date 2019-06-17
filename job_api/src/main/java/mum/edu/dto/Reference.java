package mum.edu.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class Reference implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String firstName;

	private String lastName;
	
	private String jobTitle;
	
	private String relationship;
	
	private Long studentId;
	
	private List<Contact> contacts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts.stream()
			.map( contact -> {contact.setReference(this); return contact;} )
			.collect(Collectors.toList());
	}
	

}
