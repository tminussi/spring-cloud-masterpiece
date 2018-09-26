package com.thalesminussi.aggregator.model.aggregator;

import com.thalesminussi.aggregator.model.station.WeatherResponseDto;
import com.thalesminussi.aggregator.model.wallstreet.CityInfoView;

import java.util.Collection;

public class Aggregator {

    private WeatherResponseDto weatherResponseDto;

    private Collection<CityInfoView> cityInfoView;

    public Aggregator(WeatherResponseDto weatherResponseDto, Collection<CityInfoView> cityInfoView) {
        this.weatherResponseDto = weatherResponseDto;
        this.cityInfoView = cityInfoView;
    }

    public WeatherResponseDto getWeatherResponseDto() {
        return weatherResponseDto;
    }

    public Collection<CityInfoView> getCityInfoView() {
        return cityInfoView;
    }
}
