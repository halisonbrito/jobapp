package edu.mum.entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    private String BusinessType;
    private String description;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    List<JobApplication> appls;

    public Company() {
    }

    public Company(Long id, String name, String businessType, String description, String phone) {
        this.id = id;
        this.name = name;
        BusinessType = businessType;
        this.description = description;
        this.phone = phone;
    }

    public void addJobApplication(JobApplication application){
        Objects.requireNonNull(application, "Job application cannot be NULL!");
        appls.add(application);
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
        return BusinessType;
    }

    public void setBusinessType(String businessType) {
        BusinessType = businessType;
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
