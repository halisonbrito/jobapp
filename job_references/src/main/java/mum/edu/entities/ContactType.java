package mum.edu.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContactType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6904882602715623991L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String value;
	
	@ManyToOne
	private Contact contact;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
}
