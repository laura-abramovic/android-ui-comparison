package com.laura.composeui.navigation

import androidx.annotation.DrawableRes

data class BottomNavigationItem(
    @DrawableRes val icon: Int,
    val label: String,
    val onClick: () -> Unit,
    val isSelected: Boolean
)
