package com.thalesminussi.wallstreet.controller

import com.thalesminussi.wallstreet.service.CityInfoService
import com.thalesminussi.wallstreet.view.CityInfoView
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class CityInfoController(private val cityInfoService: CityInfoService) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getCityInfo(@RequestParam country: String): Collection<CityInfoView> {
        return this.cityInfoService.getCityInfoByCountry(country)
    }
}