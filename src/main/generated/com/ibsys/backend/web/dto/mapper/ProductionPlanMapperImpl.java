package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.ProductionPlan;
import com.ibsys.backend.web.dto.ProductionPlanDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:11+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ProductionPlanMapperImpl implements ProductionPlanMapper {

    @Override
    public ProductionPlan toProductionPlan(ProductionPlanDTO productionPlanDTO) {
        if ( productionPlanDTO == null ) {
            return null;
        }

        ProductionPlan productionPlan = new ProductionPlan();

        productionPlan.setArticle( productionPlanDTO.getArticle() );
        productionPlan.setPeriodNplusOne( productionPlanDTO.getPeriodNplusOne() );
        productionPlan.setPeriodNplusTwo( productionPlanDTO.getPeriodNplusTwo() );
        productionPlan.setPeriodNplusThree( productionPlanDTO.getPeriodNplusThree() );

        return productionPlan;
    }

    @Override
    public List<ProductionPlan> toProductionPlanList(List<ProductionPlanDTO> productionPlanDTOList) {
        if ( productionPlanDTOList == null ) {
            return null;
        }

        List<ProductionPlan> list = new ArrayList<ProductionPlan>( productionPlanDTOList.size() );
        for ( ProductionPlanDTO productionPlanDTO : productionPlanDTOList ) {
            list.add( toProductionPlan( productionPlanDTO ) );
        }

        return list;
    }
}
