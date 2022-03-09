package com.example.rickandmorty.data.remote.pagingsource

import com.example.rickandmorty.common.base.BasePagingSource
import com.example.rickandmorty.data.remote.models.Location
import com.example.rickandmorty.data.remote.apiservices.LocationApi

class LocationPagingSource(
    private val serviceLocationApi: LocationApi
) : BasePagingSource<Location, Any?>({ position ->
    serviceLocationApi.getLocation(position)
})