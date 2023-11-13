package com.laura.viewsui

import android.app.Application
import com.laura.viewsui.utils.logCurrentTime

class ViewsUiApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        logCurrentTime("Application onCreate")
    }
}