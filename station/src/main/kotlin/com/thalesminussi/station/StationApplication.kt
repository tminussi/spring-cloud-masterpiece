package com.thalesminussi.station

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class StationApplication

fun main(args: Array<String>) {
    runApplication<StationApplication>(*args)

}
