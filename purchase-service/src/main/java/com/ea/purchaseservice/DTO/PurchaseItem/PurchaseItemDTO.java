package com.ea.purchaseservice.DTO.PurchaseItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PurchaseItemDTO {
    private int productId;
    private int quantity;
}
