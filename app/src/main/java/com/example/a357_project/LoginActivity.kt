package com.example.a357_project

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.a357_project.databinding.ActivitySearchBinding
import com.example.a357_project.viewmodel.WeatherViewModel

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    private lateinit var viewModel: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)

        binding.searchButton.setOnClickListener {
            val location = binding.locationInput.text.toString()
            viewModel.searchWeather(location)
            finish()
        }

        binding.saveFavoriteButton.setOnClickListener {
            val location = binding.locationInput.text.toString()
            viewModel.saveFavorite(location)
        }

        viewModel.favorites.observe(this) { favorites ->
            binding.favoritesText.text = "Favorites: ${favorites.joinToString(", ")}"
        }

        viewModel.isLoggedIn.observe(this) { isLoggedIn ->
            binding.saveFavoriteButton.visibility = if (isLoggedIn) View.VISIBLE else View.GONE
        }
    }
}