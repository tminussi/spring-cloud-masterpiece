package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class WeatherResponseDto {

    val main: Main? = null

    val weather: Collection<Weather>? = null

    val wind: Wind? = null
}