package com.example.rickandmorty.ui.fragment.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.rickandmorty.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.properties.ReadOnlyProperty

class CharacterViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    fun getCharacters() = characterRepository.getCharacters().cachedIn(viewModelScope)

}