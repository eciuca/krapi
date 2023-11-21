package com.github.eciuca.training.krapi.repo;

import com.github.eciuca.training.krapi.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
