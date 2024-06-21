package com.ibsys.backend.core.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductionPlanNew {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Integer p1;
    private Integer p2;
    private Integer p3;
}
