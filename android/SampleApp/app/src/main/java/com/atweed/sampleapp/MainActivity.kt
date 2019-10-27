package com.atweed.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun turnOn(view: View) {
        val openMessage = Toast.makeText(this, "App is on", Toast.LENGTH_SHORT);
        openMessage.show()
    }

    fun displayMessage(view: View) {
        val showMessageTextView = findViewById<TextView>(R.id.textView)
        val newMessage = "Hello Earth"
        showMessageTextView.text = newMessage
    }

    fun turnOff(view: View) {
        val closeMessage = Intent(this, SecondActivity::class.java)
        startActivity(closeMessage)
    }
}
