package com.ibsys.backend.web.dto;

import com.ibsys.backend.core.domain.entity.ProductionPlanNew;

public record ProductionPlanDtoNew(
        Integer p1,
        Integer p2,
        Integer p3
) {

    public ProductionPlanNew toProductionPlanNew() {
        return ProductionPlanNew.builder()
                .p1(p1)
                .p2(p2)
                .p3(p3)
                .build();
    }
}
