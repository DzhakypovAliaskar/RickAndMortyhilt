package com.example.rickandmorty.data.remote.retrofit

import com.example.rickandmorty.data.remote.api.CharacterApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {

    private val retrofit by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://rickandmortyapi.com/api/")
            .build()
    }


     val characterApi: CharacterApi by lazy {
        retrofit.create(CharacterApi::class.java)
    }

}