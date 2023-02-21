package com.kemalurekli.cleannews.utils

sealed class Resources<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resources<T>(data)
    class Loading<T>(val isLoading: Boolean = true) : Resources<T>(null)
    class Error<T>(message: String, data: T? = null) : Resources<T>(data, message)
}