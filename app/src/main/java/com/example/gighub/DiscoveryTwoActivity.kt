package com.example.gighub
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.ComponentActivity
import changeImage
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiscoveryTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery2)

        /* Navbar */
        var bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)

        /* Give a profile a star */
        val giveStar = findViewById<ImageView>(R.id.starIcon)
        giveStar.setOnClickListener { changeImage(giveStar, R.drawable.star_svgrepo_com, R.drawable.yellow_star) }

        /* Give a profile a heart */
        val giveHeart = findViewById<ImageView>(R.id.heartIcon)
        giveHeart.setOnClickListener { changeImage(giveHeart, R.drawable.heart_svgrepo_com, R.drawable.red_heart_icon) }


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
