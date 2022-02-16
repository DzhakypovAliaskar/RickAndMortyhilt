package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.models.CharacterModel
import com.example.rickandmorty.data.models.RickAndMortyResponse
import com.example.rickandmorty.data.remote.retrofit.RetrofitClient
import retrofit2.Response

class RickAndMortyRepository {

    suspend fun getCharacter(page: Int): Response<RickAndMortyResponse>{
        return RetrofitClient.characterApi.getCharacter(page)
    }

}