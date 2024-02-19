package com.example.proyectopokemon.models.Pokemon

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PokemonDao {
    @Insert
    fun insert(pokemon: Pokemon)

    @Query("SELECT * FROM pokemon")
    fun getAll()

    @Query("SELECT * FROM pokemon WHERE nombre=:nombre")
    fun getOne(nombre: String)
}