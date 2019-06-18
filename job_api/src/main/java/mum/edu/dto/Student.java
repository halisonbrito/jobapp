package mum.edu.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student{

	private Long id;
    private String name;
    private String entry;
    
    private List<Reference> references;
    
    public Student() {
    }

    public Student(Long id) {
    	this.id = id;
    }    
    
    public Student(String name, String entry) {
        this.name = name;
        this.entry = entry;
    }

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

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(entry, student.entry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, entry);
    }

	public List<Reference> getReferences() {
		return references;
	}

	public void setReferences(List<Reference> references) {
		this.references = references;
	}
	
}
