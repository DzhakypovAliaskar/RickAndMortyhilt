package com.example.rickandmorty.ui.fragment.episodes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.rickandmorty.data.repository.EpisodeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class EpisodeViewModel @Inject constructor(
    private val episodeRepository: EpisodeRepository
) : ViewModel() {

    fun getEpisodes() = episodeRepository.getEpisodes().cachedIn(viewModelScope)

}