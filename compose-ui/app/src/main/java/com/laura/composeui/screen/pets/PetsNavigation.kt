package com.laura.composeui.screen.pets

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val PetsScreenRoute = "pets"

fun NavGraphBuilder.petsScreen() {
    composable(PetsScreenRoute) { PetsScreen() }
}