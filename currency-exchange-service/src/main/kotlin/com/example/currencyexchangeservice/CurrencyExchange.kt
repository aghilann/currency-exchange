package com.example.currencyexchangeservice

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal

@Entity
class CurrencyExchange (

    @Id
    var id: Long,

    @Column(name = "currency_from")
    var from: String,

    @Column(name = "currency_to")
    var to: String,
    var conversionMultiple: BigDecimal,
    var environment: String
) {
    constructor() : this(0, "", "", BigDecimal.ZERO, "")
}


