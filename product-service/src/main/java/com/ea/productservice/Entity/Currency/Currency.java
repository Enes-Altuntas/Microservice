package com.ea.productservice.Entity.Currency;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Currency {
    TRY("TRY", "Türk Lirası"),
    USD("USD", "United States Dollar"),
    EUR("EUR", "European Currency");

    private String code;
    private String description;
}
