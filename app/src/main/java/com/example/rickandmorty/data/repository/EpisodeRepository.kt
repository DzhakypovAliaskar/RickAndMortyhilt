package com.example.rickandmorty.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.rickandmorty.common.base.BaseRepository
import com.example.rickandmorty.data.models.Episodes
import com.example.rickandmorty.data.models.Location
import com.example.rickandmorty.data.remote.apiservices.EpisodeApi
import com.example.rickandmorty.data.remote.apiservices.LocationApi
import com.example.rickandmorty.data.remote.pagingsource.EpisodePagingSource
import com.example.rickandmorty.data.remote.pagingsource.LocationPagingSource
import javax.inject.Inject

class EpisodeRepository @Inject constructor(
    private val service: EpisodeApi
) : BaseRepository() {

    fun getEpisode(page: Int) = doRequest {
        service.getEpisode(page)
    }

    fun getEpisodes(): LiveData<PagingData<Episodes>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                prefetchDistance = 2
            ),
            pagingSourceFactory = {
                EpisodePagingSource(service)
            }
        ).liveData
    }

}