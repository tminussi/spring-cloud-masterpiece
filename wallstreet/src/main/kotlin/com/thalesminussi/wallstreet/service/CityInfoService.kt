package com.thalesminussi.wallstreet.service

import com.thalesminussi.wallstreet.view.CityInfoView
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Service
@FeignClient(url = "\${restcountries.url}", name = "restcountries")
interface CityInfoService {

    @GetMapping("/{country}")
    fun getCityInfoByCountry(@PathVariable country: String): Collection<CityInfoView>
}