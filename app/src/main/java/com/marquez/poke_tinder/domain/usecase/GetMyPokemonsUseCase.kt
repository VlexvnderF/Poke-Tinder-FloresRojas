package com.marquez.poke_tinder.domain.usecase

import com.marquez.poke_tinder.data.PokemonRepository
import com.marquez.poke_tinder.domain.model.MyPokemon
import javax.inject.Inject

class GetMyPokemonsUseCase @Inject constructor(
    private val pokemonRepository: PokemonRepository) {
    suspend operator fun invoke(): List<MyPokemon> {
        return pokemonRepository.getMyPokemonsFromDatabase()
    }
}

