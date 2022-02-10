package com.kv.userweatherapp.presentation.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kv.userweatherapp.MyApplication
import com.kv.userweatherapp.R
import com.kv.userweatherapp.databinding.WelcomeFragmentBinding

class WelcomeFragment : Fragment() {
    lateinit var binding: WelcomeFragmentBinding

    private val viewModel: WelcomeViewModel by viewModels {
        WelcomeViewModelFactory((requireActivity().application as MyApplication).dataStoreManager)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<WelcomeFragmentBinding?>(
            inflater,
            R.layout.welcome_fragment,
            container,
            false
        ).apply {
            viewmodel = viewModel
        }
        binding.lifecycleOwner = this
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.user.observe(viewLifecycleOwner, {
            findNavController().navigate(R.id.action_welcomeFragment_to_mainFragment)
        })

        binding.btLogin.setOnClickListener({
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        })
    }
}