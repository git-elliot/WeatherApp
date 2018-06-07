package com.example.paras.weather.injection.component

import com.example.paras.weather.injection.module.OpenWeatherApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(OpenWeatherApiModule :: class))
interface OpenWeatherApiComponent{
 //   fun inject(presenter: MainPresenter)
}