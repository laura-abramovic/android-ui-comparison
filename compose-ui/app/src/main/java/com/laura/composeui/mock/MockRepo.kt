package com.laura.composeui.mock

import com.laura.composeui.domain.Pet
import com.laura.composeui.domain.PetSpecies

object MockRepo {

    fun petList(): List<Pet> {
        val pets = mutableListOf<Pet>()

        repeat(1000) {
            pets.add(
                Pet(
                    "Miki $it",
                    PetSpecies.CAT,
                    "https://images.pexels.com/photos/1170986/pexels-photo-1170986.jpeg?cs=srgb&dl=pexels-evg-kowalievska-1170986.jpg&fm=jpg"
                )
            )
        }

        return pets.toList()
    }

}

