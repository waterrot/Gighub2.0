package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


import com.google.android.material.bottomnavigation.BottomNavigationView

class ArtistHomeActivity : CustomActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepageartists)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* go to profile bar card1 match */
        val card1: CardView = findViewById(R.id.card1)
        card1.setOnClickListener {
            val intent = Intent(this, ProfileVenueViewMatchActivity::class.java)
            startActivity(intent)
        }

        /* go to profile bar card2 no match */
        val card2: CardView = findViewById(R.id.card2)
        card2.setOnClickListener {
            val intent = Intent(this, ProfileVenueViewActivity::class.java)
            startActivity(intent)
        }

        /* go to profile bar card3 no match */
        val card3: CardView = findViewById(R.id.card3)
        card3.setOnClickListener {
            val intent = Intent(this, ProfileVenueViewActivity::class.java)
            startActivity(intent)
        }
    }

}
