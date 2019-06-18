package mum.edu.dto;

import java.util.Date;

public class JobApplication {

	private Long id;
    private Date processBeginningDate;
    private String description;
    private Boolean approved;
    private String position;
    private Double salary;

    private Student student;

    private Company company;
    
    public JobApplication() {
    }

    public JobApplication(Date processBeginningDate, String description, Boolean approved, String position, Double salary) {
        this.processBeginningDate = processBeginningDate;
        this.description = description;
        this.approved = approved;
        this.position = position;
        this.salary = salary;
    }

    public JobApplication(Date processBeginningDate, String description, String position, Double salary) {
        this.processBeginningDate = processBeginningDate;
        this.description = description;
        this.position = position;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getProcessBeginningDate() {
        return processBeginningDate;
    }

    public void setProcessBeginningDate(Date processBeginningDate) {
        this.processBeginningDate = processBeginningDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
    
}
