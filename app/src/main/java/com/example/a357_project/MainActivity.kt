package com.example.a357_project

import android.os.AsyncTask
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    val CITY: String = "Allendale,MI"
    val API: String = "1fc460243bd649d898c163818242810"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

/*API fields
https://www.weatherapi.com/my/fields.aspx

Call example:
cuurent data
http://api.weatherapi.com/v1/current.json?key=1fc460243bd649d898c163818242810&q=Allendale,MI&aqi=no
forcast
http://api.weatherapi.com/v1/forecast.json?key=1fc460243bd649d898c163818242810&q=Allendale,MI&days=6&aqi=no&alerts=no
search
http://api.weatherapi.com/v1/search.json?key=1fc460243bd649d898c163818242810&q=Allendale,MI
sunrise/sunset
http://api.weatherapi.com/v1/astronomy.json?key=1fc460243bd649d898c163818242810&q=Allendale,MI&dt=2024-10-28


WeatherApp Login
Username: Katiestacey44@gmail.com
Password: Project357


 */



