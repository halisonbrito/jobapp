package mum.edu.controllers;

import java.util.List;
import java.util.Objects;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mum.edu.dto.Company;
import mum.edu.dto.JobApplication;
import mum.edu.dto.Student;
import mum.edu.services.CompanyService;
import mum.edu.services.JobApplicationService;
import mum.edu.services.StudentService;

@RestController
@RequestMapping("applications")
public class JobApplicationController {
    @Resource
    private StudentService studentService;
    @Resource
    private CompanyService companyService;
    @Resource
    private JobApplicationService jobApplicationService;

    @GetMapping
    public List<JobApplication> getAllApplications(){
        return jobApplicationService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id){
        jobApplicationService.delete(id);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public JobApplication getApplication(@PathVariable Long id){
        return jobApplicationService.get(id);
    }

    @PostMapping
    public  void addApplication(@RequestBody JobApplication application, @RequestParam Long studId, @RequestParam Long compId){
    	application.setStudent(new Student(studId));
    	application.setCompany(new Company(compId));
        
        jobApplicationService.save(application);
    }

    @PutMapping
    public void updateApplication(@RequestBody JobApplication application,@RequestParam Long studId, @RequestParam Long compId){
    	application.setStudent(new Student(studId));
    	application.setCompany(new Company(compId));
    	
        jobApplicationService.update(application);
    }

    @PutMapping("/setapproved")
    public void updateApplicationState(@RequestParam Long appId, @RequestParam Boolean approved){
        JobApplication application = jobApplicationService.get(appId);
        if (Objects.nonNull(application)){
            application.setApproved(approved);
            jobApplicationService.update(application);
        }else {
            throw new IllegalArgumentException();
        }
    }
}
