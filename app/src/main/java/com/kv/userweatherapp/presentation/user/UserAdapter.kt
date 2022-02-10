package com.kv.userweatherapp.presentation.user

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kv.userweatherapp.databinding.ItemUserBinding
import com.kv.userweatherapp.datalayer.db.user.UserEntity

class UserAdapter(var click1: View.OnClickListener) :
    ListAdapter<UserEntity, UserAdapter.ItemViewholder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        var inflater = LayoutInflater.from(parent.context)
        val binding = ItemUserBinding.inflate(inflater, parent, false)

        return ItemViewholder(binding)
    }

    override fun onBindViewHolder(holder: UserAdapter.ItemViewholder, position: Int) {
        holder.bind(getItem(position))
    }
fun getObject(position: Int): UserEntity {
    return getItem(position)
}

    inner class ItemViewholder(var binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: UserEntity) = with(itemView) {
            binding.item = item
            binding.root.setOnClickListener(click1)
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<UserEntity>() {

    override fun areItemsTheSame(oldItem: UserEntity, newItem: UserEntity): Boolean {
        return oldItem?.id == newItem?.id

    }

    override fun areContentsTheSame(oldItem: UserEntity, newItem: UserEntity): Boolean {
        return oldItem == newItem

    }
}