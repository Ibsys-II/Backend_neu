package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.Workplace;
import com.ibsys.backend.web.dto.WorkplaceDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:11+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class WorkplaceMapperImpl implements WorkplaceMapper {

    @Override
    public Workplace toWorkplace(WorkplaceDTO workplaceDTO) {
        if ( workplaceDTO == null ) {
            return null;
        }

        Workplace.WorkplaceBuilder workplace = Workplace.builder();

        workplace.id( workplaceDTO.getId() );
        workplace.idletime( workplaceDTO.getIdletime() );
        workplace.wageidletimecosts( workplaceDTO.getWageidletimecosts() );
        workplace.wagecosts( workplaceDTO.getWagecosts() );
        workplace.machineidletimecosts( workplaceDTO.getMachineidletimecosts() );
        workplace.timeneed( (int) workplaceDTO.getTimeneed() );
        workplace.period( workplaceDTO.getPeriod() );
        workplace.batch( workplaceDTO.getBatch() );
        workplace.item( workplaceDTO.getItem() );
        workplace.amount( workplaceDTO.getAmount() );

        return workplace.build();
    }
}
