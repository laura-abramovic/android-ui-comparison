package com.laura.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.laura.composeui.screen.PetsScreen
import com.laura.composeui.screen.StartScreen
import com.laura.composeui.ui.theme.ComposeUITheme
import com.laura.composeui.utils.logCurrentTime

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logCurrentTime("Activity onCreate")

        setContent {
            ComposeUITheme {
                PetsScreen()
//                StartScreen()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        logCurrentTime("Activity onStart")
    }
}
