package com.example.rickandmorty.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CharacterModel {

    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("status")
    @Expose
    private var status: String? = null

    @SerializedName("species")
    @Expose
    private var species: String? = null

    @SerializedName("type")
    @Expose
    private var type: String? = null

    @SerializedName("gender")
    @Expose
    private var gender: String? = null

    @SerializedName("origin")
    @Expose
    private var origin: Origin? = null

    @SerializedName("location")
    @Expose
    private var location: Location? = null

    @SerializedName("image")
    @Expose
    private var image: String? = null

    @SerializedName("episode")
    @Expose
    private var episode: List<String?>? = null

    @SerializedName("url")
    @Expose
    private var url: String? = null

    @SerializedName("created")
    @Expose
    private var created: String? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }

    fun getSpecies(): String? {
        return species
    }

    fun setSpecies(species: String?) {
        this.species = species
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getGender(): String? {
        return gender
    }

    fun setGender(gender: String?) {
        this.gender = gender
    }

    fun getOrigin(): Origin? {
        return origin
    }

    fun setOrigin(origin: Origin?) {
        this.origin = origin
    }

    fun getLocation(): Location? {
        return location
    }

    fun setLocation(location: Location?) {
        this.location = location
    }

    fun getImage(): String? {
        return image
    }

    fun setImage(image: String?) {
        this.image = image
    }

    fun getEpisode(): List<String?>? {
        return episode
    }

    fun setEpisode(episode: List<String?>?) {
        this.episode = episode
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String?) {
        this.url = url
    }

    fun getCreated(): String? {
        return created
    }

    fun setCreated(created: String?) {
        this.created = created
    }


}