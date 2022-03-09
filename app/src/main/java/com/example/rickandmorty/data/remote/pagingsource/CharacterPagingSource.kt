package com.example.rickandmorty.data.remote.pagingsource

import com.example.rickandmorty.common.base.BasePagingSource
import com.example.rickandmorty.data.remote.models.Character
import com.example.rickandmorty.data.remote.apiservices.CharacterApi

class CharacterPagingSource(
    private val serviceCharacterApi: CharacterApi
) : BasePagingSource<Character, Any?>({ position ->
    serviceCharacterApi.getCharacter(position)
})
