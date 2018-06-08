package com.example.paras.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import com.example.paras.weather.ui.ErrorTypes
import com.example.paras.weather.ui.ForecastItemViewModel
import com.example.paras.weather.ui.MainView

class MainActivity : AppCompatActivity(), MainView {
    override fun showSpinner() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideSpinner() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateForecast(forecase: List<ForecastItemViewModel>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showErrorToast(errorType: ErrorTypes) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        val menuItem = menu?.findItem(R.id.search_button)
        val searchMenuItem = menuItem?.actionView
        if(searchMenuItem is SearchView){

        }
        return true
    }
}
