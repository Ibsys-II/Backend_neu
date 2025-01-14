package com.ibsys.backend.web.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private Integer article;

    @Positive
    private Integer quantity;

    /**
     1 = special order
     2 = cheap vendor
     3 = Just In Time
     4 = fast
     5 = normal
     */
    private Integer modus;
}
