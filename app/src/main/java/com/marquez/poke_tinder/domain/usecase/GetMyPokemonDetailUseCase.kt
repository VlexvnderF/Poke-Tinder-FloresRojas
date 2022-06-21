package com.marquez.poke_tinder.domain.usecase

import com.marquez.poke_tinder.data.PokemonRepository
import com.marquez.poke_tinder.data.model.PokemonDetailModel
import javax.inject.Inject

class GetMyPokemonDetailUseCase @Inject constructor(private val repository: PokemonRepository) {

    suspend operator fun invoke(idPokemon: String): PokemonDetailModel {
        return repository.getPokemonDetailFromApi(idPokemon)
    }
}