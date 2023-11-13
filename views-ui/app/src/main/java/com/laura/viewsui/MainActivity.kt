package com.laura.viewsui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laura.viewsui.screen.StartFragment
import com.laura.viewsui.utils.logCurrentTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logCurrentTime("Activity onCreate")

        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, StartFragment(), StartFragment.TAG)
            .commit();
    }

    override fun onStart() {
        super.onStart()
        logCurrentTime("Activity onStart")
    }
}