package com.acme.serverless.run

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class InvoiceRow(
        var name: String = "",
        var departureDateTime: String = "",
        var departureReportDate: String = "",
        var source: String = "",
        var docNum: String = "",
        var address: String = "",
        var country: String = "")