package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.DispositinEigenfertigungResultId;
import com.ibsys.backend.core.domain.entity.DispositionEigenfertigungResult;
import com.ibsys.backend.web.dto.DispositionEigenfertigungArticleResultDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:07+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class DispositionResultMapperImpl implements DispositionResultMapper {

    @Override
    public DispositionEigenfertigungArticleResultDTO toDTO(DispositionEigenfertigungResult dispositionEigenfertigungResult) {
        if ( dispositionEigenfertigungResult == null ) {
            return null;
        }

        DispositionEigenfertigungArticleResultDTO.DispositionEigenfertigungArticleResultDTOBuilder dispositionEigenfertigungArticleResultDTO = DispositionEigenfertigungArticleResultDTO.builder();

        dispositionEigenfertigungArticleResultDTO.articleNumber( dispositionEigenfertigungResultDispositinEigenfertigungResultIdArticleNumber( dispositionEigenfertigungResult ) );
        dispositionEigenfertigungArticleResultDTO.vertriebswunsch( dispositionEigenfertigungResult.getVertriebswunsch() );
        dispositionEigenfertigungArticleResultDTO.warteschlange( dispositionEigenfertigungResult.getWarteschlange() );
        dispositionEigenfertigungArticleResultDTO.geplanterSicherheitsbestand( dispositionEigenfertigungResult.getGeplanterSicherheitsbestand() );
        dispositionEigenfertigungArticleResultDTO.lagerbestandEndeVorperiode( dispositionEigenfertigungResult.getLagerbestandEndeVorperiode() );
        dispositionEigenfertigungArticleResultDTO.auftraegeInWarteschlange( dispositionEigenfertigungResult.getAuftraegeInWarteschlange() );
        dispositionEigenfertigungArticleResultDTO.auftraegeInBearbeitung( dispositionEigenfertigungResult.getAuftraegeInBearbeitung() );
        dispositionEigenfertigungArticleResultDTO.produktionFuerKommendePeriode( dispositionEigenfertigungResult.getProduktionFuerKommendePeriode() );
        dispositionEigenfertigungArticleResultDTO.zusaetzlicheProduktionsauftraege( dispositionEigenfertigungResult.getZusaetzlicheProduktionsauftraege() );

        return dispositionEigenfertigungArticleResultDTO.build();
    }

    private int dispositionEigenfertigungResultDispositinEigenfertigungResultIdArticleNumber(DispositionEigenfertigungResult dispositionEigenfertigungResult) {
        if ( dispositionEigenfertigungResult == null ) {
            return 0;
        }
        DispositinEigenfertigungResultId dispositinEigenfertigungResultId = dispositionEigenfertigungResult.getDispositinEigenfertigungResultId();
        if ( dispositinEigenfertigungResultId == null ) {
            return 0;
        }
        int articleNumber = dispositinEigenfertigungResultId.getArticleNumber();
        return articleNumber;
    }
}
