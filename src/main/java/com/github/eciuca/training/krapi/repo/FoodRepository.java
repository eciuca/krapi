package com.github.eciuca.training.krapi.repo;

import com.github.eciuca.training.krapi.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "foods")
public interface FoodRepository extends JpaRepository<Food, String> {

    @RestResource(path = "by-company-id", rel = "by-company-id")
    List<Food> findFoodByCompanyId(@Param("companyId") String companyId);
}
