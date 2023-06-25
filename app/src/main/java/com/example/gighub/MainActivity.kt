package com.example.gighub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportActionBar?.hide()

        /* go to login */
        val buttonGoToHomeArtist = findViewById<Button>(R.id.buttonLoginArtist)

        buttonGoToHomeArtist.setOnClickListener {
            val intent = Intent(this, ArtistHomeActivity::class.java)
            startActivity(intent)
        }

        /* go to register */
        val buttonGoToRegister = findViewById<TextView>(R.id.linkRegister)

        buttonGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}