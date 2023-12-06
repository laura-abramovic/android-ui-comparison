package com.laura.viewsui.screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.laura.shared.pets.model.Pet
import com.laura.viewsui.databinding.CardPetBinding

class PetAdapter(private val pets: List<Pet>) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    class PetViewHolder(private val binding: CardPetBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Pet) {
            binding.apply {
                petName.text = item.name
                petTag.text = item.species.name.uppercase()
                image.load(item.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardPetBinding.inflate(inflater, parent, false)
        return PetViewHolder(binding)
    }

    override fun getItemCount(): Int = pets.size

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        holder.bind(pets[position])
    }
}
