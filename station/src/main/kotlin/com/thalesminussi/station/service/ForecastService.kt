package com.thalesminussi.station.service

import com.thalesminussi.station.model.WeatherResponseDto
import com.thalesminussi.station.repository.RedisRepository
import com.thalesminussi.station.rest.OpenWeatherMap
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class ForecastService(val openWeatherMap: OpenWeatherMap, val redisRepository: RedisRepository) {

    @Value("\${openWeatherApiKey}")
    private var openWeatherApiKey: String? = null

    fun getWeatherByCity(city: String, units: String?): WeatherResponseDto {
        val cachedCity = this.redisRepository.get(city)
        if (Objects.isNull(cachedCity)) {
            val weatherResponseDto = this.openWeatherMap.getWeatherByCity(city, units, openWeatherApiKey!!)
            this.redisRepository.insert(city, weatherResponseDto)
            return weatherResponseDto
        }
        return cachedCity!!
    }

}