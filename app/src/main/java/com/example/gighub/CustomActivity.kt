package com.example.gighub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class CustomActivity : AppCompatActivity() {
    override fun startActivity(intent: Intent) {
        super.startActivity(intent)
        overridePendingTransition(0, 0)
    }
}
