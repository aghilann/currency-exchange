package com.example.springcloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigServerApplication>(*args)
}
