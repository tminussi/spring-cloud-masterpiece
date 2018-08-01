package com.thalesminussi.station.repository

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.thalesminussi.station.model.WeatherResponseDto
import org.junit.Assert.*
import org.junit.Test

class RedisRepositoryTest

    @Test
    fun serialize() {
        val value = "{ \"main\": { \"temp\": 18.81, \"humidity\": 72.0, \"pressure\": 1020, \"temp_min\": 17.0, \"temp_max\": 20.0 }, \"weather\": [{ \"main\": \"Clouds\", \"description\": \"scattered clouds\" }], \"wind\": { \"speed\": 0.5, \"deg\": 290.0 } }"
        val mapper = ObjectMapper()
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
        mapper.readValue(value, WeatherResponseDto::class.java)

    }