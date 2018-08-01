package com.thalesminussi.station.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
class Wind : Serializable {

    var speed: Double? = null

    var deg: Double? = null
}