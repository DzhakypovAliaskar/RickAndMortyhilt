package com.example.rickandmorty.data.remote.models

import com.google.gson.annotations.SerializedName
import dagger.hilt.android.AndroidEntryPoint


data class RickAndMortyResponse<T>(

    @SerializedName("info")
    val info: Info,

    @SerializedName("results")
    val results: ArrayList<T>
)

