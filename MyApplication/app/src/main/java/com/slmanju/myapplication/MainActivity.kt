package com.slmanju.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            Log.i("MainActivity", "Hello! You clicked the button")
            Toast.makeText(this, "Hello! You clicked the button", Toast.LENGTH_SHORT).show()
        }

        btnSendToNext.setOnClickListener {
            Log.i("MainActivity", "Hello! You clicked the button 2")
            val userMsg = editText.text.toString()
            Toast.makeText(this, userMsg, Toast.LENGTH_SHORT).show()

            val intent = Intent(this,  SecondActivity::class.java)
            intent.putExtra("user_message", userMsg)
            startActivity(intent)
        }
    }
}
