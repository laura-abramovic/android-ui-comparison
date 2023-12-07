package com.laura.composeui.screen.start

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val StartScreenRoute = "start"

fun NavGraphBuilder.startScreen() {
    composable(StartScreenRoute) { StartScreen() }
}
