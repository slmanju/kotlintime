package com.slmanju.myapplication

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
    }
}
