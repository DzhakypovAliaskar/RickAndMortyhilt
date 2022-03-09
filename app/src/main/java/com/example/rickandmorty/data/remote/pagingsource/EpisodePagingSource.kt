package com.example.rickandmorty.data.remote.pagingsource

import com.example.rickandmorty.common.base.BasePagingSource
import com.example.rickandmorty.data.remote.models.Episodes
import com.example.rickandmorty.data.remote.apiservices.EpisodeApi

class EpisodePagingSource(
    private val servicesEpisodeApi: EpisodeApi
) : BasePagingSource<Episodes, Any?>({ position ->
    servicesEpisodeApi.getEpisode(position)
})