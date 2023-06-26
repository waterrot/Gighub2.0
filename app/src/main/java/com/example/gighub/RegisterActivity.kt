package com.example.gighub

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gighub.ui.theme.GighubTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registreerpagina)

        val buttonArtist = findViewById<Button>(R.id.btn_artiest_account_create)
        val buttonVenue = findViewById<Button>(R.id.btn_venue_account_create)

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
    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }

    /* safe which person is login in */
    private fun storeSelectedUser(userType: String) {
        val sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("selectedUser", userType)
        editor.apply()
    }

    /* go to register artist */
    private fun navigateToHomeArtist() {
        val intent = Intent(this, RegisterArtistActivity::class.java)
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
