package com.example.rickandmorty.data.models

import com.google.gson.annotations.SerializedName

data class Character(

    @SerializedName("id")
    val id: Int,

    @SerializedName("status")
    val status: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("image")
    val image: String

)