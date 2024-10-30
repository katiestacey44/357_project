package com.example.a357_project.service


import com.example.a357_project.Utils
import com.example.a357_project.model.ForeCast
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call


interface Service {

    @GET("forecast?")
    fun GetCurrentWeather(

        @Query("lat")
        lat:String,
        @Query("lon")
        lon:String,
        @Query("appid")
        appid : String = Utils.API_KEY
    ) : Call<ForeCast>

    @GET("forecast?")
    fun GetWeatherByCity(
        @Query("q")
        city: String,

        @Query("appid")
        appid : String = Utils.API_KEY
    ) : Call<ForeCast>


}

