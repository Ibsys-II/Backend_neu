package com.ibsys.backend.web.dto.mapper;

import com.ibsys.backend.core.domain.Test;
import com.ibsys.backend.web.dto.TestDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T23:51:14+0200",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class TestMapperImpl implements TestMapper {

    @Override
    public TestDTO toTestDTO(Test test) {
        if ( test == null ) {
            return null;
        }

        TestDTO.TestDTOBuilder testDTO = TestDTO.builder();

        testDTO.id( test.getId() );
        testDTO.description( test.getDescription() );

        return testDTO.build();
    }

    @Override
    public Test toTest(TestDTO testDTO) {
        if ( testDTO == null ) {
            return null;
        }

        Test.TestBuilder test = Test.builder();

        test.id( testDTO.getId() );
        test.description( testDTO.getDescription() );

        return test.build();
    }
}
