package com.thalesminussi.aggregator.client;

import com.thalesminussi.aggregator.model.wallstreet.CityInfoView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@FeignClient(value = "morannon")
@Service
public interface WallstreetClient {

    @GetMapping(value = "/countries", consumes = MediaType.APPLICATION_JSON_VALUE)
    Collection<CityInfoView> getCountryInfo(@RequestParam("country") String country);
}
