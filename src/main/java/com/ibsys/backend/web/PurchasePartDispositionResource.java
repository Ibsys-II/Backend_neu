package com.ibsys.backend.web;

import com.ibsys.backend.core.domain.entity.KQuantityNeed;
import com.ibsys.backend.core.domain.entity.ProductionPlanNew;
import com.ibsys.backend.core.domain.entity.PurchasePartDisposition;
import com.ibsys.backend.core.service.OutputService;
import com.ibsys.backend.core.service.ProductionPlanServiceNew;
import com.ibsys.backend.core.service.PurchasePartDispositionService;
import com.ibsys.backend.web.dto.OrderItemDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/purchasepartdisposition")
public class PurchasePartDispositionResource {
    private final PurchasePartDispositionService purchasePartDispositionService;
    private final OutputService outputService;
    private final ProductionPlanServiceNew productionPlanServiceNew;

    @Operation(summary = "4. Provides the purchase part disposition")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PurchasePartDisposition>> findInput() {
        var dataFromService = purchasePartDispositionService.findPurchasePartDisposition();
        dataFromService.stream()
                .map(d -> {
                    var productionPlanP1 = getProductionPlanOfProduct(1);
                    var productionPlanP2 = getProductionPlanOfProduct(2);
                    var productionPlanP3 = getProductionPlanOfProduct(3);

                    d.setRequirementNplusOne(productionPlanP1);
                    d.setRequirementNplusTwo(productionPlanP2);
                    d.setRequirementNplusOne(productionPlanP3);
                    return d;
                })
                .toList();
        return ResponseEntity.ok(dataFromService);
    }

    @Operation(summary = "4.1 Provides the K-Quantity-Needs for each bike")
    @GetMapping("/quantityneed")
    public ResponseEntity<List<KQuantityNeed>> findKQuantityNeeds() {
        return ResponseEntity.ok(purchasePartDispositionService.findKquantityNeeds());
    }

    @Operation(summary = "5. This endpoint feeds our output data with the orders")
    @PostMapping("/output")
    public ResponseEntity<List<OrderItemDTO>> addOrderItem(@RequestBody List<OrderItemDTO> orderItemDTOS) {

        return ResponseEntity.ok(outputService.addOrderItems(orderItemDTOS));
    }

    private int getProductionPlanOfProduct(final int productNUmber) {
        var productionPlanNew = productionPlanServiceNew.findAll().get(0);

        if (productNUmber == 1) return productionPlanNew.getP1();
        if (productNUmber == 2) return productionPlanNew.getP2();
        if (productNUmber == 3) return productionPlanNew.getP3();
        return 0;
    }
}
