package com.example.rickandmorty.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.common.base.BaseDiffUtilItemCallback
import com.example.rickandmorty.data.remote.models.Location
import com.example.rickandmorty.databinding.ItemLocationBinding

class LocationPagingAdapter(
) : PagingDataAdapter<Location, LocationPagingAdapter.LocationViewHolder>(
    BaseDiffUtilItemCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        return LocationViewHolder(
            ItemLocationBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class LocationViewHolder(
        private val binding: ItemLocationBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Location) {
            binding.tvName.text = item.name
            binding.tvLocation.text = item.type
        }
    }

}