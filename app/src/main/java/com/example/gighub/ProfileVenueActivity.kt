package com.example.gighub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileVenueActivity : CustomActivity() {
    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organisation_gig_info)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* go to chat overview page */
        val btnChat = findViewById<Button>(R.id.goChatOverview)

        btnChat.setOnClickListener {
            val intent = Intent(this, ChatOverviewActivity::class.java)
            startActivity(intent)
        }

        /* go to login screen */
        val btnLogout = findViewById<ImageView>(R.id.uitlog)

        btnLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
