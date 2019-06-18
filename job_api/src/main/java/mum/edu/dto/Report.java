package mum.edu.dto;

public class Report {
    private String company;
    private String description;
    private Long students;
    private Double salary;

    public Report() {
    }

    public Report(String company, String description, Long students, Double salary) {
        this.company = company;
        this.description = description;
        this.students = students;
        this.salary = salary;
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
