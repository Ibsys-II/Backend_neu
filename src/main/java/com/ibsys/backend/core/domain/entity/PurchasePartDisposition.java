package com.ibsys.backend.core.domain.entity;

import com.ibsys.backend.core.domain.status.OrderColor;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PurchasePartDisposition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_number")
    private Integer itemNumber;

    @Column(name = "delivery_time_with_deviation")
    private Double deliveryTimeWithDeviation;

    @Column(name = "delivery_time_fast")
    private Double deliveryTimeFast;

    @Column(name = "delivery_time_jit_with_deviation")
    private Double deliveryTimeJITwithDeviation;

    @Column(name = "discount_quantity")
    private Integer discountQuantity;

    @Column(name = "initial_stock")
    private Integer initialStock;

    @Column(name = "requirement_n")
    private Integer requirementN;

    @Column(name = "requirement_n_plus_one")
    private Integer requirementNplusOne;

    @Column(name = "requirement_n_plus_two")
    private Integer requirementNplusTwo;

    @Column(name = "requirement_n_plus_three")
    private Integer requirementNplusThree;

    @Column(name = "future_period_arrival")
    private Double futurePeriodArrival;

    @Column(name = "future_period_amount")
    private Integer futurePeriodAmount;

    @Column(name = "order_quantity")
    private Integer orderQuantity;

    // 4 - Fast - Eilbestellung
    // 5 - Normal - Normalbestellung
    @Column(name = "order_type")
    private Integer orderType;

    // 0 - green
    // 1 = yellow
    // 2 = red
    @Column(name = "order_color")
    private OrderColor orderColor;
}
