package com.thalesminussi.sherlock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SherlockApplication

fun main(args: Array<String>) {
    runApplication<SherlockApplication>(*args)
}
