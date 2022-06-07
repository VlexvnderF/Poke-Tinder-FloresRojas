package com.marquez.poke_tinder.data.network

import com.marquez.poke_tinder.data.model.PokemonListModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("?limit=151")
    suspend fun getPokemons() : Response<PokemonListModel>
}