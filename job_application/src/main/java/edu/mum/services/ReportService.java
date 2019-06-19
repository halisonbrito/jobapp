package edu.mum.services;

import edu.mum.entities.Report;
import edu.mum.repositories.ReportDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ReportService implements IReportService{
    @Resource
    private ReportDao reportDao;

    @Override
    public List<Report> getReport() {
        return reportDao.getReport();
    }
}
