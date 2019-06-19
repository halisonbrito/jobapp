package edu.mum.controllers;

import edu.mum.entities.Report;
import edu.mum.services.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Resource
    private ReportService service;

    @GetMapping
    List<Report> getReport(){
        return service.getReport();
    }
}
