package edu.mum.entities;


import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String businessType;
    private String description;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "company")
    @JsonIgnore
    List<JobApplication> appls;

    public Company() {
    }

    public Company(Long id, String name, String businessType, String description, String phone) {
        this.id = id;
        this.name = name;
        this.businessType = businessType;
        this.description = description;
        this.phone = phone;
    }

    public void addJobApplication(JobApplication application){
        Objects.requireNonNull(application, "Job application cannot be NULL!");
        appls.add(application);
    }

    public List<JobApplication> getAppls() {
        return appls;
    }

    public void setAppls(List<JobApplication> appls) {
        this.appls = appls;
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

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
