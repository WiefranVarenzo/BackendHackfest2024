package com.example.createmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class notificationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val btnBack : TextView = findViewById(R.id.back_arrow)
        btnBack.setOnClickListener(this)
        val btnHomepage: View = findViewById(R.id.HomePage)
        btnHomepage.setOnClickListener(this)
        val btnNavigasi: View = findViewById(R.id.ExplorePage)
        btnNavigasi.setOnClickListener(this)
        val btnMaps: View = findViewById(R.id.MapPage)
        btnMaps.setOnClickListener(this)
        val btnMessage: View = findViewById(R.id.MessagePage)
        btnMessage.setOnClickListener(this)
        val btnProfile: View = findViewById(R.id.ProfilPage)
        btnProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v?.id) {
            // Correct the ID to match the actual ID of the button

            R.id.back_arrow-> {
                val moveIntent = Intent(this@notificationActivity,Homepage ::class.java)
                startActivity(moveIntent)
            }
            R.id.HomePage -> {
                val moveIntent = Intent(this@notificationActivity, Homepage::class.java)
                startActivity(moveIntent)
            }
            R.id.ExplorePage -> {
                val moveIntent = Intent(this@notificationActivity, ExploreActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MapPage -> {
                val moveIntent = Intent(this@notificationActivity, MapActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MessagePage -> {
                val moveIntent = Intent(this@notificationActivity, notificationActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.ProfilPage -> {
                val moveIntent = Intent(this@notificationActivity, ProfilActivity ::class.java)
                startActivity(moveIntent)
            }
        }
    }

}