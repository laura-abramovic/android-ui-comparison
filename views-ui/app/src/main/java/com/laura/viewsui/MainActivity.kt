package com.laura.viewsui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.laura.viewsui.screen.PetsFragment
import com.laura.viewsui.utils.logCurrentTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logCurrentTime("Activity onCreate")

        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, PetsFragment(), PetsFragment.TAG)
            .commit();

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_greetings -> navController.navigate(R.id.start_fragment)
                R.id.item_pets -> navController.navigate(R.id.pets_fragment)
                else -> throw IllegalStateException("No such item: ${it.itemId}")
            }

            true
        }
    }

    override fun onStart() {
        super.onStart()
        logCurrentTime("Activity onStart")
    }
}