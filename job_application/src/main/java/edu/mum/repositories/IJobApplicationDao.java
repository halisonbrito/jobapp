package edu.mum.repositories;

import edu.mum.entities.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobApplicationDao extends JpaRepository<JobApplication, Long> {
}
