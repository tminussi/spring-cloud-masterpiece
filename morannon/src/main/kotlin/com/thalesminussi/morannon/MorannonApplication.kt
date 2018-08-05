package com.thalesminussi.morannon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
class MorannonApplication

fun main(args: Array<String>) {
    runApplication<MorannonApplication>(*args)
}
