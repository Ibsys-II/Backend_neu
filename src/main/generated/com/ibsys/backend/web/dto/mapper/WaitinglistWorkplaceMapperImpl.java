package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.WaitinglistWorkplace;
import com.ibsys.backend.web.dto.WaitinglistWorkplaceDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:11+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class WaitinglistWorkplaceMapperImpl implements WaitinglistWorkplaceMapper {

    @Override
    public WaitinglistWorkplace toWaitingWorkplacelist(WaitinglistWorkplaceDTO waitinglistWorkplaceDTO) {
        if ( waitinglistWorkplaceDTO == null ) {
            return null;
        }

        WaitinglistWorkplace.WaitinglistWorkplaceBuilder waitinglistWorkplace = WaitinglistWorkplace.builder();

        waitinglistWorkplace.period( waitinglistWorkplaceDTO.getPeriod() );
        waitinglistWorkplace.order( waitinglistWorkplaceDTO.getOrder() );
        waitinglistWorkplace.firstbatch( waitinglistWorkplaceDTO.getFirstbatch() );
        waitinglistWorkplace.lastbatch( waitinglistWorkplaceDTO.getLastbatch() );
        waitinglistWorkplace.item( waitinglistWorkplaceDTO.getItem() );
        waitinglistWorkplace.amount( waitinglistWorkplaceDTO.getAmount() );
        waitinglistWorkplace.timeneed( (int) waitinglistWorkplaceDTO.getTimeneed() );
        waitinglistWorkplace.workplace( waitinglistWorkplaceDTO.getWorkplace() );

        return waitinglistWorkplace.build();
    }
}
