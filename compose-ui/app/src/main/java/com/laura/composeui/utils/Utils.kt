package com.laura.composeui.utils

import android.util.Log

private const val TAG = "AppLaunchTime"

fun logCurrentTime(property: String) {
    val currentTime = System.currentTimeMillis()
    Log.d(TAG, "$property called at: $currentTime")
}