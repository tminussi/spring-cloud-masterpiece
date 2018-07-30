package com.thalesminussi.station.service

import com.thalesminussi.station.model.WeatherResponseDto
import com.thalesminussi.station.rest.OpenWeatherMap
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class ForecastService(val openWeatherMap: OpenWeatherMap) {

    @Value("\${openWeatherApiKey}")
    private var openWeatherApiKey: String? = null

    fun getWeatherByCity(city: String, units: String?): WeatherResponseDto {
        return this.openWeatherMap.getWeatherByCity(city, units, openWeatherApiKey!!)
    }

}