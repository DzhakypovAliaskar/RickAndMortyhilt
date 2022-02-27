package com.example.rickandmorty.di

import com.example.rickandmorty.data.remote.apiservices.CharacterApi
import com.example.rickandmorty.data.remote.retrofit.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofit = RetrofitClient()

    @Provides
    @Singleton
    fun providesCharacterApi(): CharacterApi =
        retrofit.providesCharacterApi()

}