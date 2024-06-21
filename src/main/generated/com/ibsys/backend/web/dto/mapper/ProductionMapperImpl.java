package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.Production;
import com.ibsys.backend.web.dto.ProductionDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:15+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ProductionMapperImpl implements ProductionMapper {

    @Override
    public ProductionDTO toProductionDTO(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionDTO.ProductionDTOBuilder productionDTO = ProductionDTO.builder();

        productionDTO.article( production.getArticle() );
        productionDTO.quantity( production.getQuantity() );

        return productionDTO.build();
    }
}
