package com.ibsys.backend.web;

import com.ibsys.backend.core.domain.entity.ProductionInPeriod;
import com.ibsys.backend.core.domain.entity.ProductionPlan;
import com.ibsys.backend.core.domain.entity.ProductionPlanNew;
import com.ibsys.backend.core.domain.entity.SellDirect;
import com.ibsys.backend.core.service.ProductionPlanService;
import com.ibsys.backend.core.service.ProductionPlanServiceNew;
import com.ibsys.backend.web.dto.ProductionInPeriodDTO;
import com.ibsys.backend.web.dto.ProductionPlanDTO;
import com.ibsys.backend.web.dto.ProductionPlanDtoNew;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/productionplan")
public class ProductionPlanResource {

    private final ProductionPlanService productionPlanService;

    private final ProductionPlanServiceNew productionPlanServiceNew;

    @Operation(summary = "Provides the initial forecast information")
    @GetMapping("/forecast")
    public ResponseEntity<List<ProductionPlan>> findInitialProductionPlan() {
        return ResponseEntity.ok(productionPlanService.findProductionPlan());
    }

    @Operation(summary = "This endpoint is supposed to be manually filled with the production plan forecast")
    @PostMapping("/forecast/new")
    public ResponseEntity<List<ProductionPlan>> addProductionPlan(@RequestBody List<ProductionPlanDTO> productionPlans) {

        return ResponseEntity.ok(productionPlanService.addProductionPlan(productionPlans));
    }

    @Operation(summary = "3. This endpoint is supposed to be manually filled with the production program")
    @PostMapping("/production/new")
    public ResponseEntity<List<ProductionInPeriod>> addProductionInPeriod(
            @RequestBody List<ProductionInPeriodDTO> productionInPeriodDTOS) {

        return ResponseEntity.ok(productionPlanService.addProductionInPeriod(productionInPeriodDTOS));
    }

    @Operation(summary = "3. This endpoint is supposed to be manually filled with the production program")
    @PostMapping("/production-new/new")
    public void addProductionPlanNew(@RequestBody ProductionPlanDtoNew productionPlanNewDto) {
        productionPlanServiceNew.create(productionPlanNewDto);
    }

    @Operation(summary = "Load Production PLan New")
    @GetMapping("/production-new")
    public ProductionPlanNew findProductionPlanNew() {
        return productionPlanServiceNew.findAll().get(0);
    }

    @Operation(summary = "2. find the production program for display")
    @GetMapping("/production/all")
    public ResponseEntity<List<ProductionInPeriod>> findProductionInPeriod() {
        return ResponseEntity.ok(productionPlanService.findProductionInPeriods());
    }

    @Operation(summary = "Shows the calculation of the planned bike stock")
    @GetMapping("/plannedbikestock")
    public ResponseEntity<List<ProductionPlan>> findPlannedBikeStock() {
        return ResponseEntity.ok(productionPlanService.findPlannedBikeStock());
    }

    @Operation(summary = "This endpoint is supposed to be manually filled with the sell direct")
    @PostMapping("/selldirect")
    public ResponseEntity<List<SellDirect>> addSellDirect(
            @RequestBody List<SellDirect> sellDirects) {

        return ResponseEntity.ok(productionPlanService.addSellDirect(sellDirects));
    }
}
