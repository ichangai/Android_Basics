package com.testapp.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val userName = intent.getStringExtra("User")
        val offerMsg = findViewById<TextView>(R.id.offerMsg)
        val message = "$userName, you can advertise for free with us"
        offerMsg.text = message
    }
}