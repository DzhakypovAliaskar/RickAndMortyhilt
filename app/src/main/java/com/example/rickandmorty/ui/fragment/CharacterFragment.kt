package com.example.rickandmorty.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.R
import com.example.rickandmorty.common.resource.Resource
import com.example.rickandmorty.databinding.FragmentCharacterBinding
import com.example.rickandmorty.ui.adapter.CharacterAdapter
import com.example.rickandmorty.ui.viewmodel.CharacterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterFragment : Fragment() {

    private val viewModel: CharacterViewModel by viewModels()
    private val characterAdapter : CharacterAdapter = CharacterAdapter()
    private lateinit var binding: FragmentCharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpObserves()
        initialize()
    }

    private fun initialize() {
        binding.characterRecycler.adapter = characterAdapter
    }

    private fun setUpObserves() {
        viewModel.getCharacter(1).observe(viewLifecycleOwner, {
            when (it) {
                is Resource.Error -> {

                }
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    characterAdapter.addList(it.data?.results)
                }
            }
        })
    }


}
