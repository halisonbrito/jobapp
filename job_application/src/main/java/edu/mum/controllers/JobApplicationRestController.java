package edu.mum.controllers;

import edu.mum.entities.Company;
import edu.mum.entities.JobApplication;
import edu.mum.entities.Student;
import edu.mum.services.ICompanyService;
import edu.mum.services.IJobApplicationService;
import edu.mum.services.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("applications")
public class JobApplicationRestController {
    @Resource
    private IStudentService studentService;
    @Resource
    private ICompanyService companyService;
    @Resource
    private IJobApplicationService jobApplicationService;

    @GetMapping
    public List<JobApplication> getAllApplicationsNoNames(){
        return jobApplicationService.getAll();
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
    public  void addApplication(@RequestBody JobApplication application){
    	jobApplicationService.add(application);
    }

    @PutMapping
    public void updateApplication(@RequestBody JobApplication application){
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
