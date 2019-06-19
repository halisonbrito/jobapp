package mum.edu.dto;

public class ReportStudent {
    private String name;
    private String entry;
    private Double salary;

    public ReportStudent() {
    }

    public ReportStudent(String name, String entry, Double salary) {
        this.name = name;
        this.entry = entry;
        this.salary = salary;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
