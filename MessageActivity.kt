package com.example.createmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MessageActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val btnBack : TextView = findViewById(R.id.back_arrow)
        btnBack.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        when (v?.id) {
            // Correct the ID to match the actual ID of the button

            R.id.back_arrow-> {
                val moveIntent = Intent(this@MessageActivity,Homepage ::class.java)
                startActivity(moveIntent)
            }
        }
    }
}