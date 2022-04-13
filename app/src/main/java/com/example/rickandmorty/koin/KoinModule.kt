package com.example.rickandmorty.koin

import com.example.rickandmorty.data.remote.retrofit.RetrofitClient
import com.example.rickandmorty.data.repository.CharacterRepository
import com.example.rickandmorty.data.repository.EpisodeRepository
import com.example.rickandmorty.data.repository.LocationRepository
import com.example.rickandmorty.ui.fragment.character.CharacterViewModel
import com.example.rickandmorty.ui.fragment.episodes.EpisodeViewModel
import com.example.rickandmorty.ui.fragment.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val remoteModule = module {
    single { RetrofitClient() }
    single { get<RetrofitClient>().providesEpisodesApi() }
    single { get<RetrofitClient>().providesLocationApi() }
    single { get<RetrofitClient>().providesCharacterApi() }
}
val viewModelModule = module {
    viewModel { EpisodeViewModel(get()) }
    viewModel { LocationViewModel(get()) }
    viewModel { CharacterViewModel(get()) }
}
val repositoriesModel = module {
    factory { LocationRepository(get()) }
    factory { EpisodeRepository(get()) }
    factory { CharacterRepository(get()) }
}

