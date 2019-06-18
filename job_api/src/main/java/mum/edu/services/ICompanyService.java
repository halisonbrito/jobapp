package mum.edu.services;

import java.util.List;

import mum.edu.dto.Company;

public interface ICompanyService {

    public List<Company> getAll();

    public void save(Company company);

    public void delete(Long id);

    public void update(Company company);

    public Company get(Long id);

	
}
