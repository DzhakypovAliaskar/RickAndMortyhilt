package com.example.rickandmorty.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EpisodeMdl {

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

}