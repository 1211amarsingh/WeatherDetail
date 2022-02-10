package com.kv.userweatherapp.presentation.login

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
import com.kv.userweatherapp.domain.model.UserModel
import com.kv.userweatherapp.databinding.LoginFragmentBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginFragment : Fragment() {

    lateinit var binding: LoginFragmentBinding

    val viewModel: LoginViewModel by viewModels {
        LoginViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate<LoginFragmentBinding?>(
            inflater,
            R.layout.login_fragment,
            container,
            false
        ).apply {
            viewmodel = viewModel
        }

        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.screenState.observe(viewLifecycleOwner) {
            when (it) {
                is LoginState.Loading -> {
                    binding.progress.visibility = View.VISIBLE
                }
                is LoginState.Error -> {
                    binding.progress.visibility = View.GONE
                    Snackbar.make(binding.root, it.message, Snackbar.LENGTH_SHORT).show()
                }
                is LoginState.Success -> {
                    binding.progress.visibility = View.GONE
                    Snackbar.make(binding.root, it.message, Snackbar.LENGTH_SHORT).show()
                    onLoginSuccess(it.data)
                }
            }
        }
    }

    private fun onLoginSuccess(data: UserModel) {
        val datastore = (requireActivity().application as MyApplication).dataStoreManager
        GlobalScope.launch {
            datastore.saveUser(data)
            withContext(Dispatchers.Main) {

                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainFragment())
            }
        }
    }
}