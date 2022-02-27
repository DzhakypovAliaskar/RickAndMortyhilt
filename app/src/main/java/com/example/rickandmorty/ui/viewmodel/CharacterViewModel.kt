package com.example.rickandmorty.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val repository: CharacterRepository
) : ViewModel() {
    fun getCharacter(page: Int) = repository.getCharacters(page)
}