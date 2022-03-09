package com.example.rickandmorty.data.remote.models

import com.example.rickandmorty.common.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class Character(

    @SerializedName("id")
    override val id: Int,

    @SerializedName("status")
    val status: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("image")
    val image: String
): IBaseDiffModel