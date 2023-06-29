package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VenueHomeActivity : CustomActivity() {

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organisation_gig_own)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* go people who are interested button 1 */
        val btnApplyOne = findViewById<Button>(R.id.btnApplyOne)

        btnApplyOne.setOnClickListener {
            val intent = Intent(this, ArtistsLikedByVenueActivity::class.java)
            startActivity(intent)
        }

        /* go people who are interested button 2 */
        val btnApplyTwo = findViewById<Button>(R.id.btnApplyTwo)

        btnApplyTwo.setOnClickListener {
            val intent = Intent(this, ArtistsLikedByVenueActivity::class.java)
            startActivity(intent)
        }

        /* go people who are interested button 3 */
        val btnApplyThree = findViewById<Button>(R.id.btnApplyThree)

        btnApplyThree.setOnClickListener {
            val intent = Intent(this, ArtistsLikedByVenueActivity::class.java)
            startActivity(intent)
        }

        /* go people who are interested button 4 */
        val btnApplyFour = findViewById<Button>(R.id.btnApplyFour)

        btnApplyFour.setOnClickListener {
            val intent = Intent(this, ArtistsLikedByVenueActivity::class.java)
            startActivity(intent)
        }

        /* go the event button 1 */
        val btnEventOne = findViewById<Button>(R.id.btnChatOne)

        btnEventOne.setOnClickListener {
            val intent = Intent(this, ProfileVenueActivity::class.java)
            startActivity(intent)
        }

        /* go the event button 2 */
        val btnEventTwo = findViewById<Button>(R.id.btnChatTwo)

        btnEventTwo.setOnClickListener {
            val intent = Intent(this, ProfileVenueActivity::class.java)
            startActivity(intent)
        }

        /* go the event button 3 */
        val btnEventThree = findViewById<Button>(R.id.btnChatThree)

        btnEventThree.setOnClickListener {
            val intent = Intent(this, ProfileVenueActivity::class.java)
            startActivity(intent)
        }

        /* go the event button 4 */
        val btnEventFour = findViewById<Button>(R.id.btnChatFour)

        btnEventFour.setOnClickListener {
            val intent = Intent(this, ProfileVenueActivity::class.java)
            startActivity(intent)
        }

        /* go to add new event */
        val buttonAddEvent: FloatingActionButton = findViewById(R.id.floatingActionButton)
        buttonAddEvent.setOnClickListener {
            val intent = Intent(this, VenueAddEventActivity::class.java)
            startActivity(intent)
        }
    }

}
