package com.example.a357_project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handling insets for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the UI for current weather and forecast
       /* val greetingTextView: TextView = findViewById(R.id.greetingTextView)
        greetingTextView.text = "Hello 357's Weather App!"

        val currentWeatherTextView: TextView = findViewById(R.id.currentWeatherTextView)
        currentWeatherTextView.text = "Current Weather: Sunny, 75°F"

        val forecastTextView: TextView = findViewById(R.id.forecastTextView)
        forecastTextView.text = "Forecast: 80°F tomorrow, partly cloudy"*/
    }
}
