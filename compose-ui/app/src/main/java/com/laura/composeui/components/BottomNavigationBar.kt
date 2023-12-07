package com.laura.composeui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.laura.composeui.navigation.BottomNavigationItem

@Composable
fun BottomNavigationBar(items: List<BottomNavigationItem>) {
    BottomNavigation(
        backgroundColor = Color.Gray
    ) {
        items.forEach {
            BottomNavigationItem(
                selected = it.isSelected,
                onClick = it.onClick,
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = it.label)
                },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray
            )
        }
    }
}