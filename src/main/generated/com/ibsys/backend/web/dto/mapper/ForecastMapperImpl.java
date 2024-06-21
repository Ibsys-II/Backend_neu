package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.Forecast;
import com.ibsys.backend.web.dto.ForecastDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:14+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ForecastMapperImpl implements ForecastMapper {

    @Override
    public Forecast toForecast(ForecastDTO forecastDTO, Integer period) {
        if ( forecastDTO == null && period == null ) {
            return null;
        }

        Forecast.ForecastBuilder forecast = Forecast.builder();

        if ( forecastDTO != null ) {
            forecast.p1( forecastDTO.getP1() );
            forecast.p2( forecastDTO.getP2() );
            forecast.p3( forecastDTO.getP3() );
        }
        if ( period != null ) {
            forecast.period( period );
        }

        return forecast.build();
    }
}
