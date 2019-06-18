package edu.mum.controllers;

import edu.mum.entities.JobApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestJobApplicationController {

    @GetMapping("/")
    public String index(){
        return "redirect:/companies";
    }
    @GetMapping("/addcompany")
    public String add(){
        return "add_company";
    }

    @GetMapping("/addapplication")
    public String application(){
        return "add_application";
    }

    @GetMapping("/applications")
    public String applicationList(){
        return "list_applications";
    }

    @GetMapping("/companies")
    public String companyList(){
        return "list_companies";
    }



}
