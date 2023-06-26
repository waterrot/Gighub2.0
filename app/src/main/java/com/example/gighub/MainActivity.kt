package com.example.gighub

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportActionBar?.hide()

        val buttonArtist = findViewById<Button>(R.id.buttonLoginArtist)
        val buttonVenue = findViewById<Button>(R.id.buttonLoginVenue)

        /* go to login Arist */
        buttonArtist.setOnClickListener {
            storeSelectedUser("Artist")
            navigateToHomeArtist()
        }

        /* go to login Venue */
        buttonVenue.setOnClickListener {
            storeSelectedUser("Venue")
            navigateToHomeVenue()
        }

        /* go to register */
        val buttonGoToRegister = findViewById<TextView>(R.id.linkRegister)

        buttonGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    /* safe which person is login in */
    private fun storeSelectedUser(userType: String) {
        val sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("selectedUser", userType)
        editor.apply()
    }

    /* go to home artist */
    private fun navigateToHomeArtist() {
        val intent = Intent(this, ArtistHomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    /* go to home venue */
    private fun navigateToHomeVenue() {
        val intent = Intent(this, VenueHomeActivity::class.java)
        startActivity(intent)
        finish()
    }

}