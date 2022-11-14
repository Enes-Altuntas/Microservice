package com.ea.purchaseservice.Service.Purchase;

import com.ea.purchaseservice.DTO.Product.ProductDTO;
import com.ea.purchaseservice.DTO.Purchase.PurchaseDTO;
import com.ea.purchaseservice.Proxy.Product.ProductServiceProxy;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    private final ProductServiceProxy productServiceProxy;

    public PurchaseServiceImpl(ProductServiceProxy productServiceProxy) {
        this.productServiceProxy = productServiceProxy;
    }

    @Override
    public Integer purchase(PurchaseDTO purchaseDTO) {
        purchaseDTO.getPurchaseItemDTOList().forEach(purchaseItemDTO -> {
            ProductDTO productDTO = productServiceProxy.getProduct(purchaseItemDTO.getProductId()).getBody();
        });

        return null;
    }
}
