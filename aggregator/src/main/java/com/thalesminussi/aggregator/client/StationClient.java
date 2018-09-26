package com.thalesminussi.aggregator.client;

import com.thalesminussi.aggregator.model.station.WeatherResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "morannon")
@Service
public interface StationClient {

    @GetMapping(value = "/weather", consumes = MediaType.APPLICATION_JSON_VALUE)
    WeatherResponseDto getWeather(@RequestParam("city") String city, @RequestParam("units") String units);
}
