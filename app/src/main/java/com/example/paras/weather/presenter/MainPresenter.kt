package com.example.paras.weather.presenter

import com.example.paras.weather.BuildConfig
import com.example.paras.weather.OpenWeatherAPI
import com.example.paras.weather.data.WeatherResponse
import com.example.paras.weather.interceptor.OpenWeatherInterceptor
import com.example.paras.weather.ui.ErrorTypes
import com.example.paras.weather.ui.MainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
class MainPresenter(val view : MainView){

@Inject lateinit var api : OpenWeatherAPI

    fun getForecastForSevenDays(cityName : String){
        if(BuildConfig.OPEN_WEATHER_API_KEY == "31861948559af4c591440a9e21415400"){
            view.showErrorToast(ErrorTypes.MISSING_API_KEY)
            return
        }
        view.showSpinner()
        api.dailyForecast(cityName,7).enqueue(object : Callback<WeatherResponse>{

            override fun onResponse(call: Call<WeatherResponse>?, response: Response<WeatherResponse>) {
              response.body()?.let{
                //createListForView(it)
                  view.hideSpinner()
              }?: view.showErrorToast(ErrorTypes.NO_RESULT_FOUND)
            }

            override fun onFailure(call: Call<WeatherResponse>?, t: Throwable) {
                view.showErrorToast(ErrorTypes.CALL_ERROR)
                t.printStackTrace()
            }


            })
    }
}