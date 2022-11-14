package com.ea.purchaseservice.Controller.Purchase;

import com.ea.purchaseservice.DTO.Purchase.PurchaseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchasement")
public class PurchaseController {
    public ResponseEntity<Integer> purchase(@RequestBody PurchaseDTO purchaseDTO) {

    }
}
