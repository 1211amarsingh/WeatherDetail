package com.kv.userweatherapp.presentation.useradd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.kv.userweatherapp.MyApplication
import com.kv.userweatherapp.R
import com.kv.userweatherapp.databinding.AddUserFragmentBinding

class AddUserFragment : Fragment() {
    val viewModel: AddUserViewModel by viewModels {
        AddUserViewModelFactory(
            (requireActivity().application as MyApplication).userRepository
        )
    }
    lateinit var binding: AddUserFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<AddUserFragmentBinding>(
            inflater,
            R.layout.add_user_fragment,
            container,
            false
        ).apply {
            viewmodel = viewModel
        }
        binding.lifecycleOwner = this
        setHasOptionsMenu(true); return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btCancel.setOnClickListener({
            findNavController().popBackStack()
        })

        viewModel.screenState.observe(viewLifecycleOwner) {
            when (it) {
                is AddUserState.Loading -> {
                    binding.progress.visibility = View.VISIBLE
                }
                is AddUserState.Error -> {
                    binding.progress.visibility = View.GONE
                    Snackbar.make(binding.root, it.message, Snackbar.LENGTH_SHORT).show()
                }
                is AddUserState.Success -> {
                    binding.progress.visibility = View.GONE
                    Snackbar.make(binding.root, it.message, Snackbar.LENGTH_SHORT).show()
                    findNavController().popBackStack()
                }
            }
        }
    }

}