package edu.mum.services;

import edu.mum.entities.Company;
import edu.mum.repositories.ICompanyDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CompanyService implements ICompanyService{
    @Resource
    private ICompanyDao companyDao;

    @Override
    public List<Company> getAll() {
        return companyDao.findAll();
    }

    @Override
    public Long add(Company company) {
        return companyDao.save(company).getId();
    }

    @Override
    public void delete(Long id) {
        companyDao.delete(get(id));
    }

    @Override
    public Long update(Company company) {
        return companyDao.save(company).getId();
    }

    @Override
    public Company get(Long id) {
        return companyDao.findById(id).get();
    }
}
