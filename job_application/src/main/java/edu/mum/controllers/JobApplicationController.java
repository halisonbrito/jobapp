package edu.mum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobApplicationController {

    @GetMapping("/")
    public String index(){
        return "redirect:/add";
    }
    @GetMapping("/add")
    public String add(){
        return "add_company";
    }

    @GetMapping("/application")
    public String application(){
        return "add_jobApplication";
    }

    @GetMapping("/applicationlist")
    public String applicationList(){
        return "list_applications";
    }

    @GetMapping("/addlist")
    public String companyList(){
        return "list_companies";
    }

}
