package edu.mum.controllers;

import edu.mum.entities.Company;
import edu.mum.entities.JobApplication;
import edu.mum.entities.Student;
import edu.mum.services.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController
public class JobAppRestController {
    @Resource
    private IStudentService studentService;
    @Resource
    private ICompanyService companyService;
    @Resource
    private IJobApplicationService jobApplicationService;

    @GetMapping(value = "/students", produces = "application/json")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @GetMapping(value = "/companies", produces = "application/json")
    public List<Company> getAllCompanies(){
        return companyService.getAll();
    }

    @GetMapping(value = "/applications", produces = "application/json")
    public List<JobApplication> getAllApplications(){
        return jobApplicationService.getAllNames();
    }

    @GetMapping(value = "/applicationswithoutnames", produces = "application/json")
    public List<JobApplication> getAllApplicationsNoNames(){
        return jobApplicationService.getAll();
    }

    @GetMapping(value = "/getstudent", produces = "application/json")
    public Student getStudent(@RequestParam Long studId){
        return studentService.get(studId);
    }

    @GetMapping(value = "/getcompany", produces = "application/json")
    public Company getCompany(@RequestParam Long compId){
        return companyService.get(compId);
    }

    @DeleteMapping("/getapplication")
    public JobApplication getJobApplication(@RequestParam Long appId){
        return jobApplicationService.get(appId);
    }

    @DeleteMapping("/deletestudent")
    public void deleteStudent(@RequestParam Long studId){
        studentService.delete(studId);
    }

    @DeleteMapping("/deletecompany")
    public void deleteCompany(@RequestParam Long compId){
        companyService.delete(compId);
    }

    @GetMapping(value = "/deleteapplication", produces = "application/json")
    public void dekleteApplication(@RequestParam Long appId){
        jobApplicationService.delete(appId);
    }

    @PostMapping(value = "/students", consumes = "application/json")
    public RedirectView addStudent(@RequestBody Company company){
        companyService.add(company);
        return new RedirectView("/students");
    }

    @PostMapping(value = "/companies", consumes = "application/json")
    public void addCompany(@RequestBody Company company){
        companyService.add(company);
    }

    @PostMapping(value = "/applications", consumes = "application/json")
    public  RedirectView addApplication(@RequestBody JobApplication application){
        jobApplicationService.add(application);
        return new RedirectView("/applications");
    }

    @PutMapping(value = "/students", consumes = "application/json")
    public RedirectView updateStudent(@RequestBody Company company){
        companyService.update(company);
        return new RedirectView("/students");
    }

    @PutMapping(value = "/companies", consumes = "application/json")
    public RedirectView updateCompany(@RequestBody Company company){
        companyService.update(company);
        return new RedirectView("/companies");
    }

    @PutMapping(value = "/applications", consumes = "application/json")
    public  RedirectView updateApplication(@RequestBody JobApplication application){
        jobApplicationService.update(application);
        return new RedirectView("/applications");
    }

    @PutMapping("/application")
    public RedirectView updateApplicationState(@RequestParam Long appId, @RequestParam Boolean approved){
        JobApplication application = jobApplicationService.get(appId);
        if (Objects.nonNull(application)){
            application.setApproved(approved);
            jobApplicationService.update(application);
        }else {
            throw new IllegalArgumentException();
        }
        return new RedirectView("/applications");
    }


}
