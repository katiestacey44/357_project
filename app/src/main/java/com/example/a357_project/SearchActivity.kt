package com.example.a357_project


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.weatherapp.databinding.FragmentSearchBinding
import com.example.weatherapp.viewmodel.WeatherViewModel

class Search : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private val viewModel: WeatherViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchButton.setOnClickListener {
            val location = binding.locationInput.text.toString()
            viewModel.searchWeather(location)
        }

        binding.saveFavoriteButton.setOnClickListener {
            val location = binding.locationInput.text.toString()
            viewModel.saveFavorite(location)
        }

        viewModel.favorites.observe(viewLifecycleOwner) { favorites ->
            binding.favoritesText.text = "Favorites: ${favorites.joinToString(", ")}"
        }

        viewModel.isLoggedIn.observe(viewLifecycleOwner) { isLoggedIn ->
            binding.saveFavoriteButton.visibility = if (isLoggedIn) View.VISIBLE else View.GONE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
class Search {
}