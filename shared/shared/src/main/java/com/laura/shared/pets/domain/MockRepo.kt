package com.laura.shared.pets.domain

import com.laura.shared.pets.model.Pet
import com.laura.shared.pets.model.PetSpecies

object MockRepo {

    fun petList(): List<Pet> {
        val pets = mutableListOf<Pet>()

        repeat(1000) {
            pets.add(
                Pet(
                    name = "Miki $it",
                    species = PetSpecies.CAT,
                    image = "https://images.pexels.com/photos/1170986/pexels-photo-1170986.jpeg?cs=srgb&dl=pexels-evg-kowalievska-1170986.jpg&fm=jpg"
                )
            )
        }

        return pets.toList()
    }
}