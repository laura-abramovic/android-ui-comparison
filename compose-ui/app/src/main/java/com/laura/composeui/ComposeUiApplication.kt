package com.laura.composeui

import android.app.Application
import com.laura.composeui.utils.logCurrentTime

class ComposeUiApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        logCurrentTime("Application onCreate")
    }
}