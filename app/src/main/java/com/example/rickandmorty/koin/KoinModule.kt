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
    single { get<RetrofitClient>().providesCharacterApi() }
    single { get<RetrofitClient>().providesEpisodesApi() }
    single { get<RetrofitClient>().providesLocationApi() }
}
val repositoriesModel = module {
    factory { CharacterRepository(get()) }
    factory { EpisodeRepository(get()) }
    factory { LocationRepository(get()) }
}
val viewModelModule = module {
    viewModel { CharacterViewModel(get()) }
    viewModel { EpisodeViewModel(get()) }
    viewModel { LocationViewModel(get()) }
}
