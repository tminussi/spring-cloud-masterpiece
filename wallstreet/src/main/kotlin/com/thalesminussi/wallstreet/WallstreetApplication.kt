package com.thalesminussi.wallstreet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
class WallstreetApplication

fun main(args: Array<String>) {
    runApplication<WallstreetApplication>(*args)
}
