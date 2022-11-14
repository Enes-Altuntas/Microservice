package com.ea.purchaseservice.Entity.PurchaseItem;

import com.ea.purchaseservice.Entity.Purchase.Purchase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Purchase_Items")
@Getter
@Setter
@RequiredArgsConstructor
public class PurchaseItem {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_PURCHASE_ITEM", sequenceName = "SEQ_PURCHASE_ITEM", allocationSize = 1)
    @GeneratedValue(generator = "GEN_PURCHASE_ITEM", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "PRODUCT_ID")
    private int productId;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "ITEM_TOTAL_PRICE")
    private double totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PURCHASE_ID")
    private Purchase purchase;
}
