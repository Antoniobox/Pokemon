package com.example.proyectopokemon.models.Pokemon

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon")
data class Pokemon(
    @PrimaryKey val nombre: String,
    @NonNull val tipo: String,
    @NonNull val altura: Float,
    @NonNull val peso: Float,
    val latitud: Double,
    val longitud: Double,
    @NonNull val habilidades: String,
    @NonNull val image: String,
)

