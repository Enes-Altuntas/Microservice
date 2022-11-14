package com.ea.purchaseservice.Controller.Purchase;

import com.ea.purchaseservice.DTO.Purchase.PurchaseDTO;
import com.ea.purchaseservice.Service.Purchase.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase")
public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping
    public ResponseEntity<Integer> purchase(@RequestBody PurchaseDTO purchaseDTO) {
        Integer purchaseId = purchaseService.purchase(purchaseDTO);
        return new ResponseEntity<>(purchaseId, HttpStatus.OK);
    }
}
