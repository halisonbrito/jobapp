package mum.edu.controllers;

import mum.edu.dto.Report;
import mum.edu.services.ReportService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Resource
    private ReportService reportService;

    @GetMapping
    public List<Report> getReportData(){
        return reportService.getAll();
    }

}
