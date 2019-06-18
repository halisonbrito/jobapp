package edu.mum.repositories;

import edu.mum.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICompanyDao extends JpaRepository<Company, Long> {
}
