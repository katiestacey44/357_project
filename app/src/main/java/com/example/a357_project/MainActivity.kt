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
https://www.weatherapi.com/my/fields.asp

WeatherAppAPI Login
Username: Katiestacey44@gmail.com
Password: Project357

open weathermap api
https://home.openweathermap.org/api_keys
username:Katie44
email:katiestacey44@gmail.com
password: 357_Password

example call : https://api.openweathermap.org/data/2.5/forecast?lat=44.34&lon=10.99&appid=705e67aa2bc71c3365d2506669ffa0d1
api key: 705e67aa2bc71c3365d2506669ffa0d1
 */
/*
task 1: connect to API [X]
task 2: ensure that API will update screen
task 3: create search screen
task 4: make search screen contents and connections to desired other activities
task 5: ensure that search screen will search locations
Task 6: ensure that Search Screen will update weatherapp screen
task 7: connect to firebase
task 8: create register and login activity
task 9: make contents for register screen
task 10: make contents for login screen
task 11: ensure that firebase will save registered users
task 12: create firestore database for locations saved
task 13: create a save location option on search screen
task 14: ensure that locations are being saved in the firestore database
task 15: ensure that the saved locations is displays on the screen
task 16: create notification messages based on current weather
task 17: create notification alerts



additional tasks:
make it look pretty


 */



