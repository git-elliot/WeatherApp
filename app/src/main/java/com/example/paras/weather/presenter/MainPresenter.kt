package com.example.paras.weather.presenter

import com.example.paras.weather.OpenWeatherAPI
import com.example.paras.weather.ui.MainView
import javax.inject.Inject

class MainPresenter(view : MainView){
@Inject lateinit var api : OpenWeatherAPI
}