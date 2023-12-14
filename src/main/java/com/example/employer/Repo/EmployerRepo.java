package com.example.employer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.employer.Entity.Employer;

@EnableJpaRepositories
@Repository
public interface EmployerRepo extends JpaRepository<Employer, Integer>{

}
