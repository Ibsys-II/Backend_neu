package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.ProductionInPeriod;
import com.ibsys.backend.web.dto.ProductionInPeriodDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:12+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ProductionInPeriodMapperImpl implements ProductionInPeriodMapper {

    @Override
    public ProductionInPeriod toProductionPlan(ProductionInPeriodDTO productionInPeriodDTO) {
        if ( productionInPeriodDTO == null ) {
            return null;
        }

        ProductionInPeriod productionInPeriod = new ProductionInPeriod();

        productionInPeriod.setArticle( productionInPeriodDTO.getArticle() );
        productionInPeriod.setPeriodNplusOne( productionInPeriodDTO.getPeriodNplusOne() );
        productionInPeriod.setPeriodNplusTwo( productionInPeriodDTO.getPeriodNplusTwo() );
        productionInPeriod.setPeriodNplusThree( productionInPeriodDTO.getPeriodNplusThree() );

        return productionInPeriod;
    }

    @Override
    public List<ProductionInPeriod> toProductionInPeriodList(List<ProductionInPeriodDTO> ProductionInPeriodDTOList) {
        if ( ProductionInPeriodDTOList == null ) {
            return null;
        }

        List<ProductionInPeriod> list = new ArrayList<ProductionInPeriod>( ProductionInPeriodDTOList.size() );
        for ( ProductionInPeriodDTO productionInPeriodDTO : ProductionInPeriodDTOList ) {
            list.add( toProductionPlan( productionInPeriodDTO ) );
        }

        return list;
    }
}
