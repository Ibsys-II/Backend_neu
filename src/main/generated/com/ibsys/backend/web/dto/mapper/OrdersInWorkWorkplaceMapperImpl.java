package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.OrdersInWorkWorkplace;
import com.ibsys.backend.web.dto.OrdersInWorkWorkplaceDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:12+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class OrdersInWorkWorkplaceMapperImpl implements OrdersInWorkWorkplaceMapper {

    @Override
    public OrdersInWorkWorkplace toOrdersInWorkWorkplace(OrdersInWorkWorkplaceDTO ordersInWorkWorkplaceDTO) {
        if ( ordersInWorkWorkplaceDTO == null ) {
            return null;
        }

        OrdersInWorkWorkplace.OrdersInWorkWorkplaceBuilder ordersInWorkWorkplace = OrdersInWorkWorkplace.builder();

        ordersInWorkWorkplace.id( ordersInWorkWorkplaceDTO.getId() );
        ordersInWorkWorkplace.period( ordersInWorkWorkplaceDTO.getPeriod() );
        ordersInWorkWorkplace.orderNumber( ordersInWorkWorkplaceDTO.getOrderNumber() );
        ordersInWorkWorkplace.batch( ordersInWorkWorkplaceDTO.getBatch() );
        ordersInWorkWorkplace.item( ordersInWorkWorkplaceDTO.getItem() );
        ordersInWorkWorkplace.amount( ordersInWorkWorkplaceDTO.getAmount() );
        ordersInWorkWorkplace.timeneed( ordersInWorkWorkplaceDTO.getTimeneed() );

        return ordersInWorkWorkplace.build();
    }
}
