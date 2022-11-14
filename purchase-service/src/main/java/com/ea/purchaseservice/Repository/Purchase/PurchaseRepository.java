package com.ea.purchaseservice.Repository.Purchase;

import com.ea.purchaseservice.Entity.Purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
}
