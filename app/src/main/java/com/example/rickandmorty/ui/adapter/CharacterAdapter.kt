package com.example.rickandmorty.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.data.models.Character
import com.example.rickandmorty.databinding.ItemCharacterBinding


class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    private var list: ArrayList<Character> = ArrayList()

    fun addList(list: ArrayList<Character>?) {
        if (list != null) {
            this.list = list
        }
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(character: Character) {
            binding.tvName.text = character.name
            binding.tvStatus.text = character.status
            Glide.with(binding.ivCharacter).load(character.image).into(binding.ivCharacter)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}
