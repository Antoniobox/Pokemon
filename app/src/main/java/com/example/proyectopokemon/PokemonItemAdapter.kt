package com.example.proyectopokemon

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PokemonItemAdapter(private val context: Context, private val pokemons: List<PokemonItem>) : BaseAdapter() {
    override fun getCount(): Int {
        return pokemons.size
    }

    override fun getItem(position: Int): Any {
        return pokemons[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val viewHolder: ViewHolder

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_pokemon, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }

        val currentItem = getItem(position) as PokemonItem
        viewHolder.nameTextView.text = currentItem.nombre
        viewHolder.tipoTextView.text = currentItem.tipo
        viewHolder.habilidadesTextView.text = currentItem.habilidades
        viewHolder.image.setImageResource(currentItem.image)
        return view!!
    }
}

private class ViewHolder(view: View) {
    val nameTextView: TextView = view.findViewById(R.id.textView5)
    val tipoTextView: TextView = view.findViewById(R.id.textView6)
    val habilidadesTextView: TextView = view.findViewById(R.id.textView7)
    val image: ImageView = view.findViewById(R.id.imageView)
}