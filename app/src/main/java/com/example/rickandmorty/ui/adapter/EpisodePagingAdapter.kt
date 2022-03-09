package com.example.rickandmorty.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.common.base.BaseDiffUtilItemCallback
import com.example.rickandmorty.data.remote.models.Episodes
import com.example.rickandmorty.databinding.ItemEpisodesBinding

class EpisodePagingAdapter(
) : PagingDataAdapter<Episodes, EpisodePagingAdapter.EpisodesViewHolder>(
    BaseDiffUtilItemCallback()
){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodesViewHolder {
        return EpisodesViewHolder(
            ItemEpisodesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EpisodesViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class EpisodesViewHolder(
        private val binding: ItemEpisodesBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: Episodes) {
            binding.tvName.text = item.name
            binding.tvEpisodes.text = item.episodes
        }
    }
}