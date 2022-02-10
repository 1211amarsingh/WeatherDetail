package com.kv.userweatherapp.presentation.weather

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.snackbar.Snackbar
import com.kv.atmapplication.util.isNetworkAvailable
import com.kv.userweatherapp.MyApplication
import com.kv.userweatherapp.R
import com.kv.userweatherapp.databinding.WeatherFragmentBinding

class WeatherFragment : Fragment() {

    val viewModel: WeatherViewModel by viewModels {
        WeatherViewModelFactory(
            (requireActivity().application as MyApplication).weatherRepository
        )
    }
    lateinit var binding: WeatherFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate<WeatherFragmentBinding>(
            inflater,
            R.layout.weather_fragment,
            container,
            false
        ).apply {
            viewmodel = viewModel
        }
        binding.lifecycleOwner = this
        setHasOptionsMenu(true);

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (isNetworkAvailable(requireContext())) {
            viewModel.getWeatherData()
        } else {
            Snackbar.make(binding.root, "No internet Connection", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }
}