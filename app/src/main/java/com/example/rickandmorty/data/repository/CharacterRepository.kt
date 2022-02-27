package com.example.rickandmorty.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.rickandmorty.common.resource.Resource
import com.example.rickandmorty.data.remote.apiservices.CharacterApi
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import javax.inject.Inject


class CharacterRepository @Inject constructor(
    private val service: CharacterApi
) {

    fun getCharacters(page: Int) = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            Log.e("tag", service.getCharacter(page).toString())
            emit(Resource.Success(service.getCharacter(page)))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Error !", null))
        }
    }

}