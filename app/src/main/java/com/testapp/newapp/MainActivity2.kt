package com.testapp.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.i("MYTAG", "MainActivity2 : OnCreate")
        val userName = intent.getStringExtra("User")
        val offerMsg = findViewById<TextView>(R.id.offerMsg)
        val message = "$userName, you can advertise for free with us"
        offerMsg.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG", "MainActivity2 : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG", "MainActivity2 : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG", "MainActivity2 : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG", "MainActivity2 : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG", "MainActivity2 : OnDestroy")
    }
}