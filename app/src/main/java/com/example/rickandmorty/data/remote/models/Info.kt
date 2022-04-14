package com.example.rickandmorty.data.remote.models

import com.google.gson.annotations.SerializedName
import dagger.hilt.android.AndroidEntryPoint


data class Info(

@SerializedName("count")
val count: Int,

@SerializedName("pages")
val pages: Int,

@SerializedName("next")
val next: String,

@SerializedName("prev")
val prev: String?

)
