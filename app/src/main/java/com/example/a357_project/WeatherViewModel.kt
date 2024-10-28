package com.example.a357_project.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlin.random.Random

data class WeatherData(
    val temp: Int,
    val weather: String,
    val sunrise: String,
    val sunset: String,
    val humidity: Int,
    val windSpeed: Int
)

class WeatherViewModel : ViewModel() {
    private val _weather = MutableLiveData<WeatherData>()
    val weather: LiveData<WeatherData> = _weather

    private val _location = MutableLiveData<String>()
    val location: LiveData<String> = _location

    private val _isLoggedIn = MutableLiveData<Boolean>()
    val isLoggedIn: LiveData<Boolean> = _isLoggedIn

    private val _favorites = MutableLiveData<List<String>>()
    val favorites: LiveData<List<String>> = _favorites

    fun login(email: String, password: String) {
        // Simulate login process
        viewModelScope.launch {
            // In a real app, you would call Firebase Auth here
            _isLoggedIn.value = true
        }
    }

    fun register(email: String, password: String) {
        // Simulate registration process
        viewModelScope.launch {
            // In a real app, you would call Firebase Auth here
            _isLoggedIn.value = true
        }
    }

    fun logout() {
        // Simulate logout process
        _isLoggedIn.value = false
    }

    fun searchWeather(location: String) {
        // Simulate API call
        viewModelScope.launch {
            _location.value = location
            _weather.value = WeatherData(
                temp = Random.nextInt(0, 30),
                weather = listOf("Sunny", "Cloudy", "Rainy").random(),
                sunrise = "06:00",
                sunset = "20:00",
                humidity = Random.nextInt(30, 90),
                windSpeed = Random.nextInt(0, 20)
            )
        }
    }

    fun saveFavorite(location: String) {
        val currentFavorites = _favorites.value ?: emptyList()
        _favorites.value = currentFavorites + location
    }

    fun refreshWeather() {
        _location.value?.let { searchWeather(it) }
    }
}