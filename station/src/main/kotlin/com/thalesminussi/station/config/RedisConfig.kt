package com.thalesminussi.station.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import redis.clients.jedis.Jedis

@Configuration
class RedisConfig {

    @Bean
    fun jedis(): Jedis {
        return Jedis()
    }

}