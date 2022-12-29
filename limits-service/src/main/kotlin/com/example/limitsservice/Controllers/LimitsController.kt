package com.example.limitsservice.Controllers

import com.example.limitsservice.Beans.Limits
import com.example.limitsservice.Configuration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsController {

    @Autowired
    lateinit var configuration: Configuration

    @GetMapping("/limits")
        fun retrieveLimits(): Limits {
            return Limits(configuration.minimum, configuration.maximum)
        }
}