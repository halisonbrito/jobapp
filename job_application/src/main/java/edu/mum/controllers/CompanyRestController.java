package edu.mum.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.entities.Company;
import edu.mum.services.ICompanyService;

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
