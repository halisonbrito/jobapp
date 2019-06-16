package edu.mum.repositories;

import edu.mum.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyDao extends JpaRepository<Company, Long> {
}
