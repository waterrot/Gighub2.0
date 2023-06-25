package com.example.gighub
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiscoveryTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery2)

        /* Navbar */
        var bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* Give it a star */
        val giveItStar = findViewById<ImageView>(R.id.giveItAStar)

        giveItStar.setOnClickListener {
            val intent = Intent(this, DiscoveryTwoFavoriteActivity::class.java)
            startActivity(intent)
        }

        /* Make it favorite */
        val makeFavorite = findViewById<ImageView>(R.id.goFavorite)

        makeFavorite.setOnClickListener {
            val intent = Intent(this, DiscoveryTwoLikeActivity::class.java)
            startActivity(intent)
        }

        /* Go to profile */
        val goProfile = findViewById<ImageView>(R.id.goToProfile)

        goProfile.setOnClickListener {
            val intent = Intent(this, ProfileOneActivity::class.java)
            startActivity(intent)
        }
    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }
}
