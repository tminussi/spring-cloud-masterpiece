package com.thalesminussi.aggregator.model;

public class RequestInfo {
    private final String country;
    private final String city;

    public RequestInfo(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
