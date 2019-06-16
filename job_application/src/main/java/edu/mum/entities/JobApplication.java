package edu.mum.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jobapplication")
public class JobApplication {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date processBeginningDate;
    private String description;
    private Boolean approved;
    private String position;
    private Double salary;

    public JobApplication() {
    }

    public JobApplication(Date processBeginningDate, String description, Boolean approved, String position, Double salary) {
        this.processBeginningDate = processBeginningDate;
        this.description = description;
        this.approved = approved;
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
}
