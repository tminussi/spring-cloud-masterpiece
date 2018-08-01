package com.thalesminussi.station.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.thalesminussi.station.model.WeatherResponseDto
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository
import redis.clients.jedis.Jedis
import java.util.*

@Repository
class RedisRepository(val jedis: Jedis, val objectMapper: ObjectMapper) {

    @Value("\${redis.insertionType}")
    private var insertionType: String? = null

    @Value("\${redis.expirationType}")
    private var expirationType: String? = null

    @Value("\${redis.expiresIn}")
    private var expiresIn: Long? = null

    fun insert(city: String, weatherResponseDto: WeatherResponseDto) {
        this.jedis.set(city, objectMapper.writeValueAsString(weatherResponseDto), insertionType, expirationType, expiresIn!!)
    }

    fun get(city: String): WeatherResponseDto? {
        val cachedCity = this.jedis.get(city)
        if (Objects.isNull(cachedCity)) {
            return null
        }
        return this.objectMapper.readValue(cachedCity, WeatherResponseDto::class.java)
    }
}