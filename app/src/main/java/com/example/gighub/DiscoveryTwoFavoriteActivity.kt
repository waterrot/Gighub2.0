package com.example.gighub

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class DiscoveryTwoFavoriteActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery_like)

        /* Navbar */
        var bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }
}
