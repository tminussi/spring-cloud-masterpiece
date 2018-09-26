package com.thalesminussi.aggregator.service;

import com.thalesminussi.aggregator.client.StationClient;
import com.thalesminussi.aggregator.client.WallstreetClient;
import com.thalesminussi.aggregator.model.RequestInfo;
import com.thalesminussi.aggregator.model.aggregator.Aggregator;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AggregatorService {

    private final StationClient stationClient;

    private final WallstreetClient wallstreetClient;

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public AggregatorService(StationClient stationClient, WallstreetClient wallstreetClient, RabbitTemplate rabbitTemplate) {
        this.stationClient = stationClient;
        this.wallstreetClient = wallstreetClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    public Aggregator aggregate(String city, String country) {
        rabbitTemplate.convertAndSend(new RequestInfo(city, country), m -> {
            m.getMessageProperties().setHeader("type", "request");
            return m;
        });
        return new Aggregator(this.stationClient.getWeather(city), this.wallstreetClient.getCountryInfo(country));
    }
}
