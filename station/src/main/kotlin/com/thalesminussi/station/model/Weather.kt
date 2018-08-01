package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Weather : Serializable {

    var main: String? = null
    var description: String? = null
}