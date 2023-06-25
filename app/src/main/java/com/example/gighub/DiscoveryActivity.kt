package com.example.gighub

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class DiscoveryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery)

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
