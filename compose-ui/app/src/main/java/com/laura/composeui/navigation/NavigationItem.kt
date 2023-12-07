package com.laura.composeui.navigation

import androidx.annotation.DrawableRes
import com.laura.composeui.R
import com.laura.composeui.screen.pets.PetsScreenRoute
import com.laura.composeui.screen.start.StartScreenRoute

private const val GreetingsLabel = "Greetings"
private const val PetsLabel = "Pets"

data class NavItem(
    @DrawableRes val icon: Int,
    val label: String,
    val route: String
)

object NavigationItem {
    val Start = NavItem(
        icon = R.drawable.ic_waving_hand,
        label = GreetingsLabel,
        route = StartScreenRoute
    )

    val Pets = NavItem(
        icon = R.drawable.ic_pets,
        label = PetsLabel,
        route = PetsScreenRoute
    )
}