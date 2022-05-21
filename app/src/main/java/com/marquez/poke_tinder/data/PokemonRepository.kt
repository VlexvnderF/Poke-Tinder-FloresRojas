package com.marquez.poke_tinder.data

import com.marquez.poke_tinder.data.model.PokemonListModel
import com.marquez.poke_tinder.data.model.PokemonModel
import com.marquez.poke_tinder.data.network.PokemonService
import com.marquez.poke_tinder.domain.model.Pokemon
import com.marquez.poke_tinder.domain.model.toDomain
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val pokemonService: PokemonService
) {
    suspend fun getAllPokemonFromApi(): List<Pokemon> {
        val listResponse: PokemonListModel = pokemonService.getPokemons()
        val response: List<PokemonModel> = listResponse.results
        return response.map { it.toDomain() }
    }
}