package com.laura.composeui.domain

data class Pet(
    val name: String,
    val species: PetSpecies,
    val image: String
)

enum class PetSpecies {
    CAT, DOG, HAMSTER, TURTLE, FISH
}
