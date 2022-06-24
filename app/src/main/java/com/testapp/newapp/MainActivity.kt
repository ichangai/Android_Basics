package com.testapp.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG", "MainActivity : Oncreate")
        val title = findViewById<TextView>(R.id.mainTitle)
        val inputField = findViewById<EditText>(R.id.userName)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val offerBtn = findViewById<Button>(R.id.offerBtn)
        var username = ""
        submitBtn.setOnClickListener {
            username = inputField.text.toString()
            if (username == "") {
                Toast.makeText(this@MainActivity, "Please, enter your name!", Toast.LENGTH_SHORT)
            } else {
                val msg = "Welcome home $username"
                Log.i("MYTAG", msg)
                title.text = msg
                Log.i("MYTAG", "After displaying the message on the TextView")
                inputField.text.clear()
                offerBtn.visibility = VISIBLE
            } 
        }
        offerBtn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("User", username)
            startActivity(intent)
        }
    }
}