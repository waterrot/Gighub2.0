package com.example.gighub
import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView


class BottomNavigationListener(private val activity: AppCompatActivity) :
    NavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_to_chat -> {
                val intent = Intent(activity, ChatOverviewActivity::class.java)
                activity.startActivity(intent)

                return true
            }
            R.id.nav_to_venues -> {
                val intent = Intent(activity, ArtistHomeActivity::class.java)
                activity.startActivity(intent)
                return true
            }
            R.id.nav_to_discovery -> {
                val intent = Intent(activity, DiscoveryActivity::class.java)
                activity.startActivity(intent)
                return true
            }
            R.id.nav_to_profile -> {
                val intent = Intent(activity, ProfileOneActivity::class.java)
                activity.startActivity(intent)
                return true
            }
        }
        return false
    }
}
