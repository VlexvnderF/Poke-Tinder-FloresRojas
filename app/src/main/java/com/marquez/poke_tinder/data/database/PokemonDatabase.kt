package com.marquez.poke_tinder.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.marquez.poke_tinder.data.database.entities.MyPokemonEntity

@Database(entities = [MyPokemonEntity::class], version = 1)
abstract class PokemonDatabase: RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}