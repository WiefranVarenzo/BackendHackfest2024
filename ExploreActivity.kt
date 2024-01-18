package com.example.createmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ExploreActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val btnBack : TextView = findViewById(R.id.BackMainPage)
        btnBack.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when (v?.id) {
            // Correct the ID to match the actual ID of the button

            R.id.BackMainPage-> {
                val moveIntent = Intent(this@ExploreActivity,Homepage ::class.java)
                startActivity(moveIntent)
            }
        }
    }
}