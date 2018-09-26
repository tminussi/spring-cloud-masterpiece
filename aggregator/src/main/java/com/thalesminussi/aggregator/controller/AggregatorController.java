package com.thalesminussi.aggregator.controller;

import com.thalesminussi.aggregator.model.aggregator.Aggregator;
import com.thalesminussi.aggregator.service.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AggregatorController {

    private final AggregatorService aggregatorService;

    @Autowired
    public AggregatorController(AggregatorService aggregatorService) {
        this.aggregatorService = aggregatorService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Aggregator aggregate(@RequestParam String city, @RequestParam(required = false) String units, @RequestParam String country) {
        return this.aggregatorService.aggregate(city, units, country);
    }
}
