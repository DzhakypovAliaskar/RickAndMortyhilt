package com.example.rickandmorty.data.remote.apiservices

import com.example.rickandmorty.data.models.Character
import com.example.rickandmorty.data.models.RickAndMortyResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApi {

    @GET("api/character/{id}")
    suspend fun getId(@Path("id") id: Int
    ): Character


    @GET("api/character")
    suspend fun getCharacter(
        @Query("page") page: Int
    ): RickAndMortyResponse<Character>
}
