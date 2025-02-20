package com.ibsys.backend.core.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class ProductionInPeriod {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private int article;

    @Column(name = "period_n")
    private int periodN;

    @Column(name = "period_n_plus_one")
    private int periodNplusOne;

    @Column(name = "period_n_plus_two")
    private int periodNplusTwo;

    @Column(name = "period_n_plus_three")
    private int periodNplusThree;
}
