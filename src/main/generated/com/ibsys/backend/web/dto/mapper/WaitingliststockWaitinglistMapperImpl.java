package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.WaitingliststockWaitinglist;
import com.ibsys.backend.web.dto.WaitingliststockWaitinglistDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:15+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class WaitingliststockWaitinglistMapperImpl implements WaitingliststockWaitinglistMapper {

    @Override
    public WaitingliststockWaitinglist toWaitingliststockWaitlinglist(WaitingliststockWaitinglistDTO waitinglistDTO) {
        if ( waitinglistDTO == null ) {
            return null;
        }

        WaitingliststockWaitinglist.WaitingliststockWaitinglistBuilder waitingliststockWaitinglist = WaitingliststockWaitinglist.builder();

        waitingliststockWaitinglist.period( waitinglistDTO.getPeriod() );
        waitingliststockWaitinglist.orderNumber( waitinglistDTO.getOrderNumber() );
        waitingliststockWaitinglist.firstbatch( waitinglistDTO.getFirstbatch() );
        waitingliststockWaitinglist.lastbatch( waitinglistDTO.getLastbatch() );
        waitingliststockWaitinglist.item( waitinglistDTO.getItem() );
        waitingliststockWaitinglist.amount( waitinglistDTO.getAmount() );
        waitingliststockWaitinglist.timeNeed( waitinglistDTO.getTimeNeed() );

        return waitingliststockWaitinglist.build();
    }
}
