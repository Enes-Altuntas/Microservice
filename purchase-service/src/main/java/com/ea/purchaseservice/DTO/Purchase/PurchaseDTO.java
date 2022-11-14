package com.ea.purchaseservice.DTO.Purchase;

import com.ea.purchaseservice.DTO.PurchaseItem.PurchaseItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PurchaseDTO {
    private List<PurchaseItemDTO> purchaseItemDTOList;
    private int userId;
}
