package edu.mum.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Student{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String entry;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    @Json
    private List<JobApplication> applications;

    public Student() {
    }

    public Student(String name, String entry) {
        this.name = name;
        this.entry = entry;
    }

    public void addJobApplication(JobApplication application){
        Objects.requireNonNull(application, "Job application cannot be NULL!");
        applications.add(application);
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

    public List<JobApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<JobApplication> applications) {
        this.applications = applications;
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
}
