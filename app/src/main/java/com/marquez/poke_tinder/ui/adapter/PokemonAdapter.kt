package com.marquez.poke_tinder.ui.adapter

import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marquez.poke_tinder.R
import com.marquez.poke_tinder.databinding.ItemPokemonBinding
import com.marquez.poke_tinder.domain.model.Pokemon
import com.marquez.poke_tinder.util.inflate

import kotlinx.coroutines.NonDisposableHandle.parent

import javax.security.auth.callback.Callback

class PokemonAdapter(
    var list: List<Pokemon>,
    val callback: Callback
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = parent.inflate(R.layout.item_pokemon)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size

    inner class  ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val binding = ItemPokemonBinding.bind(view)

        fun bind(pokemon: Pokemon) {
            with(binding) {
                root.setOnClickListener {
                    callback.onClickPokemonInformation(pokemon)
                }
                tvName.text = pokemon.name
                Glide
                    .with(itemView)
                    .load(pokemon.getPokemonImage())
                    .into(binding.ivPokemon)
            }
        }
    }
    interface Callback {
        fun onClickPokemonInformation(pokemon: Pokemon)
    }
}