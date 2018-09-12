package com.thalesminussi.wallstreet.view

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CurrencyView {

    val code: String? = null

    val name: String? = null

    val symbol: String? = null
}