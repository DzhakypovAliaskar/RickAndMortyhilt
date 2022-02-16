package com.example.rickandmorty.data.remote.api

import android.telecom.Call
import com.example.rickandmorty.data.models.RickAndMortyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {

    @GET("character")
    suspend fun getCharacter(
        @Query("page") page: Int
    ): Response<RickAndMortyResponse>

}