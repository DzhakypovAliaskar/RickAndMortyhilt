package com.example.rickandmorty.ui.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.models.RickAndMortyResponse
import com.example.rickandmorty.data.repository.RickAndMortyRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class CharacterViewModel(val repository: RickAndMortyRepository) : ViewModel() {

    var listCharacter = MutableLiveData<Response<RickAndMortyResponse>>()

    fun getCharacters(page:Int){
        viewModelScope.launch {
            val characters = repository.getCharacter(page)
            listCharacter.value = characters
        }
    }

}