package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VenueAddEventActivity : CustomActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organisatie_gig_new)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* Place new event */
        val buttonAddEvent: Button = findViewById(R.id.GoToEvents)
        buttonAddEvent.setOnClickListener {
            val intent = Intent(this, VenueHomeActivity::class.java)
            startActivity(intent)
        }

    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }

}
