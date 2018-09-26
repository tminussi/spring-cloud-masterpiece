package com.thalesminussi.aggregator.model.station;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponseDto {

    private Main main;

    private Collection<Weather> weather;

    private Wind wind;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Collection<Weather> getWeather() {
        return weather;
    }

    public void setWeather(Collection<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
