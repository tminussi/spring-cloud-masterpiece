package com.thalesminussi.aggregator.model.wallstreet;

import java.util.Collection;

public class CityInfoView {

    private Collection<CurrencyView> currencies;

    public Collection<CurrencyView> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Collection<CurrencyView> currencies) {
        this.currencies = currencies;
    }
}
