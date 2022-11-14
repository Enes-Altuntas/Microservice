package com.ea.purchaseservice.Entity.Purchase;

import com.ea.purchaseservice.Entity.PurchaseItem.PurchaseItem;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Purchases")
@Getter
@Setter
@RequiredArgsConstructor
public class Purchase {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_PURCHASE", sequenceName = "SEQ_PURCHASE", allocationSize = 1)
    @GeneratedValue(generator = "GEN_PURCHASE", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;

    @Column(name = "USER_ID")
    private int userId;

    @OneToMany(mappedBy = "purchase", orphanRemoval = true)
    @Column(name = "PURCHASE_ITEM_ID")
    private List<PurchaseItem> purchaseItem;
}
