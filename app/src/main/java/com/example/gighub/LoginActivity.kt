package com.example.gighub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.gighub.ui.theme.GighubTheme


class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpagina)

        /* go to login */
        val buttonGoToHomeArtist = findViewById<Button>(R.id.buttonLoginArtist)

        buttonGoToHomeArtist.setOnClickListener {
            val intent = Intent(this, ArtistHomeActivity::class.java)
            startActivity(intent)
        }
    }
}