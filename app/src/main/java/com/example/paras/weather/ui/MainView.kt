package com.example.paras.weather.ui

interface MainView{
    fun showSpinner()
    fun hideSpinner()
    fun updateForecase(forecase : List<ForecastItemViewModel>)
    fun showErrorToast(errorType : ErrorTypes )
}

enum class ErrorTypes {
    MISSING_API_KEY, NO_RESULT_FOUND, CALL_ERROR
}

data class ForecastItemViewModel(val degreeDay : String,
                                 val icon : String = "01d",
                                 val date : Long = System.currentTimeMillis(),
                                 val description : String = "No description")