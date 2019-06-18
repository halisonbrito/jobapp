package edu.mum.services;

import edu.mum.entities.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> getAll();
    Long add(Company company);
    void delete(Long id);
    Long update(Company company);
    Company get(Long id);

}
