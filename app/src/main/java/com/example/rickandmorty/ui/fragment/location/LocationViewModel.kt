package com.example.rickandmorty.ui.fragment.location

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.rickandmorty.data.repository.LocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class LocationViewModel @Inject constructor(
    private val locationRepository: LocationRepository
) : ViewModel() {

    fun getLocations() = locationRepository.getLocations().cachedIn(viewModelScope)

}