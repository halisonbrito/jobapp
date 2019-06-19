package edu.mum.entities;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private Long companyId;
    private String company;
    private String description;
    private Long students;
    private Double salary;
    private Double salaryMax;

    private List<ReportStudent> studentList = new ArrayList<>();

    public Report() {
    }

    public Report(Long id, String company, String description, Long students, Double salary, Double salaryMax) {
        this.company = company;
        this.salaryMax = salaryMax;
        companyId = id;
        this.description = description;
        this.students = students;
        this.salary = salary;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Double getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Double salaryMax) {
        this.salaryMax = salaryMax;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<ReportStudent> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<ReportStudent> studentList) {
        this.studentList = studentList;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStudents() {
        return students;
    }

    public void setStudents(Long students) {
        this.students = students;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
