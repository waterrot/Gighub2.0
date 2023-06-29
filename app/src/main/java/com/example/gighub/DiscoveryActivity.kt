package com.example.gighub

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.ComponentActivity
import changeImage
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiscoveryActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery)
        supportActionBar?.hide()

        /* Give a profile a star */
        val giveStar = findViewById<ImageView>(R.id.starIcon)
        giveStar.setOnClickListener { changeImage(giveStar, R.drawable.star_svgrepo_com, R.drawable.yellow_star) }

        /* Give a profile a heart */
        val giveHeart = findViewById<ImageView>(R.id.heartIcon)
        giveHeart.setOnClickListener { changeImage(giveHeart, R.drawable.heart_svgrepo_com, R.drawable.red_heart_icon) }

        /* Navbar */
        var bottomNav: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        BottomNavigationHelper.setupBottomNavigation(this, bottomNav)


        /* go to discovery2 page 2 */
        val buttonGoToDiscoveryTwo = findViewById<ImageView>(R.id.goNextDiscovery)

        buttonGoToDiscoveryTwo.setOnClickListener {
            val intent = android.content.Intent(this, DiscoveryTwoActivity::class.java)
            startActivity(intent)
        }
    }

    /* back button */
    fun onBackButtonClicked(view: View) {
        finish()
    }


}
