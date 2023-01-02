package com.example.currencyconversionservice

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.math.BigDecimal

@RestController
class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    fun calculateCurrencyConversion(
        @PathVariable from: String,
        @PathVariable to: String,
        @PathVariable quantity: BigDecimal
    ): CurrencyConversion {

        val uriVariables : HashMap<String, String> = HashMap()
        uriVariables["from"] = from
        uriVariables["to"] = to
        uriVariables["quantity"] = quantity.toString()

        val response: ResponseEntity<CurrencyConversion> = RestTemplate().getForEntity(
            "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
            CurrencyConversion::class.java,
            uriVariables)

        val currencyConversion = response.body
        return CurrencyConversion(
            currencyConversion!!.id,
            from, to, quantity,
            currencyConversion.conversionMultiple,
            quantity.multiply(currencyConversion.conversionMultiple),
            currencyConversion.environment)
    }
    }
