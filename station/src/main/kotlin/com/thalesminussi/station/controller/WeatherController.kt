package com.thalesminussi.station.controller

import com.thalesminussi.station.model.WeatherResponseDto
import com.thalesminussi.station.service.ForecastService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class WeatherController(val forecastService: ForecastService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getWeatherByCity(@RequestParam city: String, @RequestParam(required = false) units: String?): WeatherResponseDto {
        return this.forecastService.getWeatherByCity(city, units)
    }
}