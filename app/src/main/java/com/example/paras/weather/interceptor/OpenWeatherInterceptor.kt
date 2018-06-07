package com.example.paras.weather.interceptor

import com.example.paras.weather.BuildConfig
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response


class OpenWeatherInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val url : HttpUrl = chain.request().url().newBuilder().addQueryParameter("APPID",BuildConfig.OPEN_WEATHER_API_KEY).
                addQueryParameter("mode","json").
                addQueryParameter("units","metrics").build()
        return chain.proceed(chain.request().newBuilder().addHeader("Accept","application/json").url(url).build())

    }

}
