package com.example.gighub

import android.content.Context
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationHelper {

    companion object {
        fun setupBottomNavigation(context: Context, bottomNav: BottomNavigationView) {
            bottomNav.setOnNavigationItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.nav_to_chat -> {
                        val intent = Intent(context, ChatOverviewActivity::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_to_venues -> {
                        val intent = Intent(context, ArtistHomeActivity::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_to_discovery -> {
                        val intent = Intent(context, DiscoveryActivity::class.java)
                        context.startActivity(intent)
                        true
                    }
                    R.id.nav_to_profile -> {
                        val intent = Intent(context, ProfileArtistActivity::class.java)
                        context.startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
        }
    }
}
