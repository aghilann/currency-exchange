package com.example.currencyexchangeservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class CurrencyExchangeController {

    @Autowired
    private lateinit var repository: CurrencyExchangeRepository;

    @Autowired
    lateinit var environment: Environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(
        @PathVariable from: String,
        @PathVariable to: String
    ): CurrencyExchange {

        val currencyExchange = repository.findByFromAndTo(from, to)
            ?: throw RuntimeException("Unable to find data for $from to $to")

        val port = environment.getProperty("local.server.port")
        currencyExchange.environment = port ?: "8000"
        return currencyExchange;
    }
}
