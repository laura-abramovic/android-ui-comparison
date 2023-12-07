package com.laura.composeui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.laura.composeui.screen.main.MainScreen
import com.laura.composeui.screen.pets.petsScreen
import com.laura.composeui.screen.start.StartScreenRoute
import com.laura.composeui.screen.start.startScreen

@Composable
fun MainNavigationGraph() {
    val navController = rememberNavController()

    MainScreen(
        bottomNavigationItems = listOf(
            mapToBottomNavigation(
                navigationItem = NavigationItem.Start,
                navController = navController
            ),
            mapToBottomNavigation(
                navigationItem = NavigationItem.Pets,
                navController = navController
            ),
        )
    ) {
        NavHost(
            navController = navController,
            startDestination = StartScreenRoute
        ) {
            startScreen()
            petsScreen()
        }
    }
}

@Composable
private fun mapToBottomNavigation(
    navigationItem: NavItem,
    navController: NavController
): BottomNavigationItem {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentHierarchy = navBackStackEntry?.destination?.hierarchy

    return BottomNavigationItem(
        icon = navigationItem.icon,
        label = navigationItem.label,
        onClick = {
            navController.navigate(navigationItem.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }

                restoreState = true
                launchSingleTop = true
            }
        },
        isSelected = currentHierarchy?.any { it.route == navigationItem.route } == true
    )
}
