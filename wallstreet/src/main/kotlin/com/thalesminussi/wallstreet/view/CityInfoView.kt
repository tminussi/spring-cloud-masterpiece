package com.thalesminussi.wallstreet.view

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CityInfoView {

    val currencies: Collection<CurrencyView>? = null
}