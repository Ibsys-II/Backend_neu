package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.entity.Article;
import com.ibsys.backend.web.dto.ArticleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:13+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public Article toArticle(ArticleDTO articleDTO) {
        if ( articleDTO == null ) {
            return null;
        }

        Article.ArticleBuilder article = Article.builder();

        article.id( articleDTO.getId() );
        article.amount( articleDTO.getAmount() );
        article.startamount( articleDTO.getStartamount() );
        article.pct( articleDTO.getPct() );
        article.price( articleDTO.getPrice() );
        article.stockvalue( articleDTO.getStockvalue() );

        return article.build();
    }
}
