package com.example.limitsservice

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("limits-service")
class Configuration {
    var minimum = 0
    var maximum = 0
}
