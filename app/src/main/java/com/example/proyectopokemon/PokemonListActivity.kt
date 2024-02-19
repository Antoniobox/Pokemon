package com.example.proyectopokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.proyectopokemon.models.Pokemon.Pokemon
import com.example.proyectopokemon.models.Pokemon.PokemonDatabase
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Polyline
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PokemonListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_list)
        val listView = findViewById<ListView>(R.id.listado)
        val pokemons = listOf<PokemonItem>(
            PokemonItem("Pikachu", "Eléctrico", 0.4f, 6.0f, "Parrayos", R.drawable.pikachu),
            PokemonItem("Charizard", "Fuego", 1.7f, 90.5f, "Mar Llamas", R.drawable.charizard)
        )
        val adapter = PokemonItemAdapter(this,pokemons)
        listView.adapter = adapter
    }
}