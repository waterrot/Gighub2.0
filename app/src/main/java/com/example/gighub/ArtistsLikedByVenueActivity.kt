package com.example.gighub

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gighub.ui.theme.GighubTheme
import com.google.android.material.bottomnavigation.BottomNavigationView

class ArtistsLikedByVenueActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.organisation_liked_page)
        supportActionBar?.hide()

        /* Navbar */
        bottomNav = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

    }

    fun onBackButtonClicked(view: View) {
        finish()
    }
}