package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.OrderItem;
import com.ibsys.backend.web.dto.OrderItemDTO;
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
public class OrderItemMapperImpl implements OrderItemMapper {

    @Override
    public OrderItem toOrderItem(OrderItemDTO productionInPeriodDTO) {
        if ( productionInPeriodDTO == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setArticle( productionInPeriodDTO.getArticle() );
        orderItem.setQuantity( productionInPeriodDTO.getQuantity() );
        orderItem.setModus( productionInPeriodDTO.getModus() );

        return orderItem;
    }

    @Override
    public List<OrderItem> toOrderItemList(List<OrderItemDTO> ProductionInPeriodDTOList) {
        if ( ProductionInPeriodDTOList == null ) {
            return null;
        }

        List<OrderItem> list = new ArrayList<OrderItem>( ProductionInPeriodDTOList.size() );
        for ( OrderItemDTO orderItemDTO : ProductionInPeriodDTOList ) {
            list.add( toOrderItem( orderItemDTO ) );
        }

        return list;
    }
}
