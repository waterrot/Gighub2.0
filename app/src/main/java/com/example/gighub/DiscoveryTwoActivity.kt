package com.example.gighub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
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

class DiscoveryTwoActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery2)

        /* Give it a star */
        val giveItStar = findViewById<ImageView>(R.id.giveItAStar)

        giveItStar.setOnClickListener {
            val intent = Intent(this, DiscoveryTwoLikeActivity::class.java)
            startActivity(intent)
        }

        /* Make it favorite */
        val makeFavorite = findViewById<ImageView>(R.id.goFavorite)

        makeFavorite.setOnClickListener {
            val intent = Intent(this, DiscoveryTwoFavoriteActivity::class.java)
            startActivity(intent)
        }

        /* Go to profile */
        val goProfile = findViewById<ImageView>(R.id.goToProfile)

        goProfile.setOnClickListener {
            val intent = Intent(this, ProfileOneActivity::class.java)
            startActivity(intent)
        }
    }
}
