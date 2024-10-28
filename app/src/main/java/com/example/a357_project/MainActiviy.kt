package com.example.a357_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.a357_project.databinding.ActivityMainBinding
import com.example.a357_project.viewmodel.WeatherViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)

        viewModel.weather.observe(this) { weather ->
            binding.tempText.text = "${weather.temp}°C"
            binding.weatherText.text = weather.weather
            binding.sunriseText.text = "Sunrise: ${weather.sunrise}"
            binding.sunsetText.text = "Sunset: ${weather.sunset}"
            binding.humidityText.text = "Humidity: ${weather.humidity}%"
            binding.windSpeedText.text = "Wind Speed: ${weather.windSpeed} km/h"
        }

        viewModel.location.observe(this) { location ->
            binding.locationText.text = "Weather in $location"
        }

        binding.searchButton.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        binding.loginLogoutButton.setOnClickListener {
            if (viewModel.isLoggedIn.value == true) {
                viewModel.logout()
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }

        viewModel.isLoggedIn.observe(this) { isLoggedIn ->
            binding.loginLogoutButton.text = if (isLoggedIn) "Logout" else "Login"
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.refreshWeather()
    }
}