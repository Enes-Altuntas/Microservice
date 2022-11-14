package com.ea.purchaseservice.Entity.Purchase;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    private int productId;

    private int
}
