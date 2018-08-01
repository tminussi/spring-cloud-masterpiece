package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Main : Serializable {

    var temp: Double? = null

    var humidity: Double? = null

    var pressure: Integer? = null

    @JsonProperty("temp_min")
    var tempMin: Double? = null

    @JsonProperty("temp_max")
    var tempMax: Double? = null
}