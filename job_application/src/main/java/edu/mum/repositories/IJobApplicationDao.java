package edu.mum.repositories;

import edu.mum.entities.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IJobApplicationDao extends JpaRepository<JobApplication, Long>{

    //@Query(
     //       value = "select j.id, j.approved, j.process_beginning_date, j.description\n" +
     //               "                    , j.position, j.salary, s.name as student, c.name as company from jobapplication j left join student s on s.id = j.student_id\n" +
     //               "                left join company c on j.company_id = c.id",
      //      nativeQuery = true)
    //List<JobApplication> findAllApplicationsNative();

}
