package com.kv.userweatherapp.presentation.user

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kv.userweatherapp.MyApplication
import com.kv.userweatherapp.R
import com.kv.userweatherapp.databinding.HomeFragmentBinding


class HomeFragment : Fragment() {

    val viewModel: HomeViewModel by viewModels {
        HomeViewModelFactory(
            (requireActivity().application as MyApplication).userRepository
        )
    }
    lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<HomeFragmentBinding>(
            inflater,
            R.layout.home_fragment,
            container,
            false
        ).apply {
            viewmodel = viewModel
        }
        binding.lifecycleOwner = this
        setHasOptionsMenu(true);
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home_menu, menu)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var userAdapter = UserAdapter(View.OnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionMainFragmentToWeatherFragment())
        })
        binding.rvUser.adapter = userAdapter

        viewModel.userAll.observe(viewLifecycleOwner, {
            userAdapter.submitList(it)
        })
    }
}