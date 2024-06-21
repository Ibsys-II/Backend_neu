package com.ibsys.backend.core.repository;

import com.ibsys.backend.core.domain.entity.ProductionPlanNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionPlanRepositoryNew extends JpaRepository<ProductionPlanNew, Long> {
}
