package com.thalesminussi.wallstreet.controller

import com.thalesminussi.wallstreet.service.CityInfoService
import com.thalesminussi.wallstreet.view.CityInfoView
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class CityInfoController(private val cityInfoService: CityInfoService) {

    @GetMapping("{country}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getCityInfo(@PathVariable country: String): Collection<CityInfoView> {
        return this.cityInfoService.getCityInfoByCountry(country)
    }
}