package com.example.rickandmorty.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.rickandmorty.common.base.BaseRepository
import com.example.rickandmorty.data.remote.apiservices.CharacterApi
import com.example.rickandmorty.data.remote.models.Character
import com.example.rickandmorty.data.remote.pagingsource.CharacterPagingSource
import javax.inject.Inject


class CharacterRepository(
    private val service: CharacterApi
) : BaseRepository(){


    fun getCharacter(page: Int) = doRequest {
        service.getCharacter(page)
    }

    fun getCharacters(): LiveData<PagingData<Character>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                prefetchDistance = 2
            ),
            pagingSourceFactory = {
                CharacterPagingSource(service)
            }
        ).liveData
    }

}