package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class WeatherResponseDto : Serializable {

    val main: Main? = null

    val weather: Collection<Weather>? = null

    val wind: Wind? = null
}