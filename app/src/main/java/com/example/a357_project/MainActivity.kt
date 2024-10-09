package com.example.a357_project

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import java.net.URL

class MainActivity : AppCompatActivity() {

    val CITY: String = "Allendale, MI"
    val API: String = "8b623b3c84a84f89b2c124733242409"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherTask().execute()
    }
    inner class weatherTask() : AsyncTask<String, Void, String >(){
        override fun onPreExecute() {
            super.onPreExecute()
            findViewById<ProgressBar>(R.id.loader).visibility = View.VISIBLE
            findViewById<RelativeLayout>(R.id.mainContainer).visibility = View.GONE
            findViewById<TextView>(R.id.errortext).visibility = View.GONE
        }
        override fun doInBackground(vararg p0:String?): String{
            var response:String?
            try{
               response = URL("http://api.weatherapi.com/v1")
//http://api.weatherapi.com/v1/current.json?key=YOUR_API_KEY&q=CITY
            }
        }

    }
}
