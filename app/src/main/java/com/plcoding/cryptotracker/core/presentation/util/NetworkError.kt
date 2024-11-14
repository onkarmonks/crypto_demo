package com.plcoding.cryptotracker.core.presentation.util

import android.content.Context
import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.NetworkError.*

fun NetworkError.toString(context: Context): String {
    val resId =  when(this) {
        REQUEST_TIMEOUT -> R.string.error_request_timeout
        TOO_MANY_REQUEST -> R.string.error_too_many_request
        NO_INTERNET -> R.string.error_no_internet
        SERVER_ERROR -> R.string.error_unknown
        SERIALIZATION -> R.string.error_serialization
        UNKNOWN -> R.string.error_unknown
    }

    return context.getString(resId)
}