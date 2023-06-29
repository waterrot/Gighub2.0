package com.example.gighub

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileOneActivity : CustomActivity() {
    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilepageheadsouth)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)
    }
}
