package com.ibsys.backend.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "orderitem")
@Data
@JsonTypeName("order")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class OrderItem {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @JsonIgnore()
    private Long id;

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
