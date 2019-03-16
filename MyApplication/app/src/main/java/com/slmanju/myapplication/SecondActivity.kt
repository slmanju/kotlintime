package com.slmanju.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val userMsg = bundle!!.getString("user_message")

        Toast.makeText(this, userMsg, Toast.LENGTH_SHORT).show()

        txvUserMsg.text = userMsg
    }

}