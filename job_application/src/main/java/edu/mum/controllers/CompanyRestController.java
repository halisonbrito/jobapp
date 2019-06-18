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
@RequestMapping("/companies")
public class CompanyRestController {
    @Resource
    private ICompanyService companyService;

    @GetMapping
    public List<Company> getAllCompanies(){
        return companyService.getAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Company getCompany(@PathVariable Long id){
        return companyService.get(id);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void deleteCompany(@PathVariable Long id){
        companyService.delete(id);
    }

    @PostMapping
    public void addCompany(@RequestBody Company company){
        companyService.add(company);
    }

    @PutMapping
    public void updateCompany(@RequestBody Company company){
        companyService.update(company);
    }
}
