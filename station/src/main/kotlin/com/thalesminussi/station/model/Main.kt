package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonProperty

class Main {

    var temp: Double? = null

    var humidity: Double? = null

    var pressure: Integer? = null

    @JsonProperty("temp_min")
    var tempMin: Double? = null

    @JsonProperty("temp_max")
    var tempMax: Double? = null
}