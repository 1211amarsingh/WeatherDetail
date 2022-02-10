package com.kv.userweatherapp.presentation.user

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.kv.userweatherapp.MyApplication
import com.kv.userweatherapp.R
import com.kv.userweatherapp.databinding.HomeFragmentBinding
import com.kv.userweatherapp.data.db.user.UserEntity


class HomeFragment : Fragment() {

    val viewModel: HomeViewModel by viewModels {
        HomeViewModelFactory(
            (requireActivity().application as MyApplication).userRepository
        )
    }
    lateinit var binding: HomeFragmentBinding
    lateinit var userAdapter: UserAdapter
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
        userAdapter = UserAdapter(View.OnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionMainFragmentToWeatherFragment())
        })
        binding.rvUser.adapter = userAdapter

        viewModel.userAll.observe(viewLifecycleOwner, {
            userAdapter.submitList(it)
        })
        swipeListener();
    }

    private fun swipeListener() {

        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            //You can add multiple swipe direction such as ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val itemPosition = viewHolder.adapterPosition
                val deleteNote: UserEntity = userAdapter.getObject(itemPosition)

                // Since MainActivity observes LiveData, any changes in the Note table or in ViewModel reflects in RecyclerView immediately
                // Which means we don't need to reload table data to recyclerView or notifyDataSetChanged callbacks
                viewModel.delete(deleteNote)
                Snackbar.make(viewHolder.itemView, "Note deleted", Snackbar.LENGTH_LONG).show()
            }
        }).attachToRecyclerView(binding.rvUser)
    }
}