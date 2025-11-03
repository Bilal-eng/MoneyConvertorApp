package com.mc.network.response.currency_convertor

import kotlinx.serialization.Serializable

@OptIn(kotlinx.serialization.InternalSerializationApi::class)
@Serializable
open class CurrencyConvertorResponse {
    val message: String? = null
}