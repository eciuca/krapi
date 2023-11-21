package com.github.eciuca.training.krapi.repo;

import com.github.eciuca.training.krapi.domain.Agent;
import com.github.eciuca.training.krapi.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "companies")
public interface CompanyRepository extends JpaRepository<Company, String> {
}
