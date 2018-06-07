package com.example.paras.weather.presenter

import com.example.paras.weather.BuildConfig
import com.example.paras.weather.OpenWeatherAPI
import com.example.paras.weather.interceptor.OpenWeatherInterceptor
import com.example.paras.weather.ui.ErrorTypes
import com.example.paras.weather.ui.MainView
import javax.inject.Inject

class MainPresenter(val view : MainView){

@Inject lateinit var api : OpenWeatherAPI

    fun getForecastForSevenDays(cityName : String){
        if(BuildConfig.OPEN_WEATHER_API_KEY == "31861948559af4c591440a9e21415400"){
            view.showErrorToast(ErrorTypes.MISSING_API_KEY)
            return
        }
        view.showSpinner()
        api.dailyForecast(cityName,7)
    }
}