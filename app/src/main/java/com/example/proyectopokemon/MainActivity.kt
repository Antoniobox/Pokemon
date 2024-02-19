package com.example.proyectopokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.proyectopokemon.models.Pokemon.Pokemon
import com.example.proyectopokemon.models.Pokemon.PokemonDatabase
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Polyline
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.buttonIniciarSesion)

        btn.setOnClickListener(View.OnClickListener {
            var inputUsuario = findViewById<EditText>(R.id.textView2)
            var inputContrasena = findViewById<EditText>(R.id.editText)

            if(inputUsuario.text.toString() == "usuario" && inputContrasena.text.toString() == "contrasena") {
                val intent = Intent(this, PokemonListActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Incorrecto mi rey", Toast.LENGTH_SHORT).show()
            }
        })
    }
}