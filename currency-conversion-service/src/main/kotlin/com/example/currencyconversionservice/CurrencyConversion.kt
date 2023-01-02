package com.example.currencyconversionservice

import java.math.BigDecimal

class CurrencyConversion(
    val id: Long = 0,
    val from: String = "",
    val to: String = "",
    val quantity: BigDecimal = BigDecimal.ZERO,
    val conversionMultiple: BigDecimal = BigDecimal.ZERO,
    val totalCalculatedAmount: BigDecimal = BigDecimal.ZERO,
    val environment: String = ""
) {
    constructor() : this(0, "", "", BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, "")
}