package com.laura.composeui.screen.main

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.laura.composeui.components.BottomNavigationBar
import com.laura.composeui.navigation.BottomNavigationItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    bottomNavigationItems: List<BottomNavigationItem>,
    content: @Composable () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(items = bottomNavigationItems)
        }
    ) {
        content()
    }
}