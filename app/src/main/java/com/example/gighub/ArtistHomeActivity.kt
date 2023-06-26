package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


import com.google.android.material.bottomnavigation.BottomNavigationView

class ArtistHomeActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepageartists)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* go to profile bar */
        val card1: CardView = findViewById(R.id.card1)
        card1.setOnClickListener {
            val intent = Intent(this, ProfileVenueActivity::class.java)
            startActivity(intent)
        }
    }

}
