package com.example.rickandmorty.ui

import android.app.Application
import com.example.rickandmorty.koin.remoteModule
import com.example.rickandmorty.koin.repositoriesModel
import com.example.rickandmorty.koin.viewModelModule
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(remoteModule, repositoriesModel, viewModelModule)
        }

    }
}