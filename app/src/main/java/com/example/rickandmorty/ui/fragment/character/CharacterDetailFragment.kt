package com.example.rickandmorty.ui.fragment.character

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rickandmorty.R
import dagger.hilt.android.AndroidEntryPoint

class CharacterDetailFragment : Fragment(R.layout.fragment_detail_character) {

    private lateinit var binding: CharacterDetailFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail_character, container, false)
    }

}