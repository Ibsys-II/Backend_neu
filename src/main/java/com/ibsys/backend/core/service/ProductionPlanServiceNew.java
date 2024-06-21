package com.ibsys.backend.core.service;

import com.ibsys.backend.core.domain.entity.ProductionPlanNew;
import com.ibsys.backend.core.repository.ProductionPlanRepositoryNew;
import com.ibsys.backend.web.dto.ProductionPlanDtoNew;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductionPlanServiceNew {

    private final ProductionPlanRepositoryNew productionPlanRepositoryNew;

    public List<ProductionPlanNew> findAll() {
        return productionPlanRepositoryNew.findAll();
    }

    public void create(final ProductionPlanDtoNew productionPlanDtoNew) {
        productionPlanRepositoryNew.deleteAll();
        productionPlanRepositoryNew.save(productionPlanDtoNew.toProductionPlanNew());
    }
}
