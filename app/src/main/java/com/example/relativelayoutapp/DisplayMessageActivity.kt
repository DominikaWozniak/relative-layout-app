package com.example.relativelayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_mesaage)


        val name = intent.getStringExtra(NAME)
        val lastName = intent.getStringExtra(LAST_NAME)

    }
}