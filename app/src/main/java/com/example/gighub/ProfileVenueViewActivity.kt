package com.example.gighub

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileVenueViewActivity : ComponentActivity() {

    lateinit var bottomNav: BottomNavigationView
    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organisation_gig_info_view)

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        myButton = findViewById(R.id.buttonChangeColor)
        myButton.setOnClickListener {
            // Change color and text when the button is pressed
            changeButtonColor()
            changeButtonText()
        }
    }

    private fun changeButtonColor() {
        // Change the background color of the button
        myButton.setBackgroundColor(Color.LTGRAY)
    }

    private fun changeButtonText() {
        // Change the text of the button
        myButton.text = "Wacht op antwoord..."
    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }
}
