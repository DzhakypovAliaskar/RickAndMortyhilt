package com.example.rickandmorty.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.rickandmorty.common.base.BaseRepository
import com.example.rickandmorty.data.models.Location
import com.example.rickandmorty.data.remote.apiservices.LocationApi
import com.example.rickandmorty.data.remote.pagingsource.LocationPagingSource
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val service: LocationApi
) : BaseRepository(){

//    fun getLocation(page : Int) = doRequest {
//        service.getLocation(page)
//    }

    fun getLocations(): LiveData<PagingData<Location>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                prefetchDistance = 2
            ),
            pagingSourceFactory = {
                LocationPagingSource(service)
            }
        ).liveData
    }
}