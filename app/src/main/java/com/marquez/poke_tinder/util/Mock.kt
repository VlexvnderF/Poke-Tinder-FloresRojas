package com.marquez.poke_tinder.util

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marquez.poke_tinder.R
import com.marquez.poke_tinder.data.Onboarding

class Mock {
    fun getOnboarding() = listOf(
        Onboarding(
            id = 1,
            img = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png",
            namePokemon = "Squirtle",
            title = "Desliza hacia la derecha para acceder a la información de un Pokemón"
        ),
        Onboarding(
            id = 2,
            img = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png",
            namePokemon = "Mewtoo",
            title = "Guarda su información en tu teléfono tapeando sobre la Pokebola"
        ),
        Onboarding(
            id = 3,
            img = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png",
            namePokemon = "Pikachu",
            title = "Desliza hacia la izquierda en caso desees ver otros Pokemones"
        )
    )
}
