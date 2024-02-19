package com.example.proyectopokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectopokemon.models.Pokemon.Pokemon
import com.example.proyectopokemon.models.Pokemon.PokemonDatabase
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Polyline
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PokemonMap : AppCompatActivity() {
    val urlBase="https://api.openrouteservice.org/";
    private lateinit var map: GoogleMap
    private var start:String = ""
    private var end:String = ""
    var poly: Polyline? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_map)

        GlobalScope.launch {
            val db = PokemonDatabase.getDataBase(applicationContext)
            var pokemonDao = db.pokemonDao()
            var pikachu = Pokemon("Pikachu","Electrico",0.7f, 0.5f, 38.053206, -0.868253, "Electricidad estática", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/25.png")
            var charizard = Pokemon("Charizard", "Fuego", 1.7f, 90.5f, 38.053409, -0.869395, "Mar Llamas", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png");
            var bulbasaur = Pokemon("Bulbasaur","Planta",0.7f,6.9f,38.053696,-0.869458,"Espesura","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png")
            var squirtle = Pokemon("Squirtle", "Agua", 0.5f, 9.0f,  38.05363, 0.86968, "Torrente", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png")
            var mewtwo = Pokemon("Mewtwo","Psíquico",2.0f,122.0f,38.053434, -0.869130,"Presión","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png")
            pokemonDao.insert(pikachu)
            pokemonDao.insert(charizard)
            pokemonDao.insert(bulbasaur)
            pokemonDao.insert(squirtle)
            pokemonDao.insert(mewtwo)
        }
    }
}