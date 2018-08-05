package com.thalesminussi.station

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
class StationApplication

fun main(args: Array<String>) {
    runApplication<StationApplication>(*args)

}
