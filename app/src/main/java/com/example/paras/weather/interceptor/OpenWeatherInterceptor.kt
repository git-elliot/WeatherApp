package com.example.paras.weather.interceptor

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response


class OpenWeatherInterceptor : Interceptor {
    val OPEN_WEATHER_API_KEY : String = "31861948559af4c591440a9e21415400"

    override fun intercept(chain: Interceptor.Chain): Response {

        val url : HttpUrl = chain.request().url().newBuilder().addQueryParameter("APPID",OPEN_WEATHER_API_KEY).
                addQueryParameter("mode","json").
                addQueryParameter("units","metrics").build()
        return chain.proceed(chain.request().newBuilder().addHeader("Accept","application/json").url(url).build())

    }

}
