package com.example.gighub

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationHelper {

    companion object {
        fun setupBottomNavigation(context: Context, bottomNav: BottomNavigationView) {
            val sharedPreferences = context.getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
            val selectedUser = sharedPreferences.getString("selectedUser", "")

            bottomNav.setOnNavigationItemSelectedListener { menuItem ->
                when (selectedUser) {
                    "Artist" -> handleArtistNavigation(context, menuItem)
                    "Venue" -> handleVenueNavigation(context, menuItem)
                    else -> false
                }
            }
        }

        private fun handleArtistNavigation(context: Context, menuItem: MenuItem): Boolean {
            when (menuItem.itemId) {
                R.id.nav_to_chat -> {
                    val intent = Intent(context, ChatOverviewActivity::class.java)
                    context.startActivity(intent)
                    return true
                }
                R.id.nav_to_venues -> {
                    val intent = Intent(context, ArtistHomeActivity::class.java)
                    context.startActivity(intent)
                    return true
                }
                R.id.nav_to_discovery -> {
                    val intent = Intent(context, DiscoveryActivity::class.java)
                    context.startActivity(intent)
                    return true
                }
                R.id.nav_to_profile -> {
                    val intent = Intent(context, ProfileArtistActivity::class.java)
                    context.startActivity(intent)
                    return true
                }
                else -> return false
            }
        }

        private fun handleVenueNavigation(context: Context, menuItem: MenuItem): Boolean {
            when (menuItem.itemId) {
                R.id.nav_to_chat -> {
                    val intent = Intent(context, ChatOverviewActivity::class.java)
                    context.startActivity(intent)
                    return true
                }

                R.id.nav_to_venues -> {
                    val intent = Intent(context, VenueHomeActivity::class.java)
                    context.startActivity(intent)
                    return true
                }

                R.id.nav_to_discovery -> {
                    val intent = Intent(context, DiscoveryActivity::class.java)
                    context.startActivity(intent)
                    return true
                }

                R.id.nav_to_profile -> {
                    val intent = Intent(context, ProfileVenueActivity::class.java)
                    context.startActivity(intent)
                    return true
                }

                else -> return false
            }
        }
    }
}
