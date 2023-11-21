package com.github.eciuca.training.krapi.repo;

import com.github.eciuca.training.krapi.domain.StudentReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "studentreports")
public interface StudentReportRepository extends JpaRepository<StudentReport, Long> {

    @RestResource(path = "by-student-id", rel = "by-student-id")
    List<StudentReport> findStudentReportByStudentId(@Param("studentId") Long studentId);
}
