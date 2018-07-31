package com.thalesminussi.station.rest

import com.thalesminussi.station.model.WeatherResponseDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(url = "http://api.openweathermap.org/data/2.5/weather", name = "open-weather-map")
interface OpenWeatherMap {

    @GetMapping
    fun getWeatherByCity(@RequestParam q: String, @RequestParam(required = false) units: String?, @RequestParam appid: String): WeatherResponseDto

}