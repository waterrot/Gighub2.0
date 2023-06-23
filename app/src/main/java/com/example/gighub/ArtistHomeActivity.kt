package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.google.android.material.bottomnavigation.BottomNavigationView

class ArtistHomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepageartists)
        supportActionBar?.hide()

        loadFragment(ChatFragment())
        bottomNav = findViewById(R.id.bottomNavigationView)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_to_chat -> {
                    loadFragment(ChatFragment())
                    true
                }
                R.id.nav_to_venues -> {
                    loadFragment(VenueFragment())
                    true
                }
                R.id.nav_to_discovery -> {
                    loadFragment(DiscoveryFragment())
                    true
                }
                R.id.nav_to_profile -> {
                    loadFragment(ProfileFragment())
                    true
                }
            else -> false
            }
        }

        /* go to chat with venue */
        val goToChatBarMash = findViewById<ImageView>(R.id.iconCompanyHomeArtistOne)

        goToChatBarMash.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }



}
