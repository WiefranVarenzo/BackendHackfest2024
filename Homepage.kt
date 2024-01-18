package com.example.createmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Homepage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

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

        val SearchMission : TextView = findViewById(R.id.findmission)
        SearchMission.setOnClickListener(this)
        val btncreateMission : TextView = findViewById(R.id.createmission)
        btncreateMission.setOnClickListener(this)
        val btnSellingGarbagePage: TextView = findViewById(R.id.btnsellgarbage)
        btnSellingGarbagePage.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v?.id) {
            // Correct the ID to match the actual ID of the button
            R.id.findmission -> {
                val moveIntent = Intent(this@Homepage, RecyclerViewActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.createmission -> {
                val moveIntent = Intent(this@Homepage, create_mission::class.java)
                startActivity(moveIntent)
            }
            R.id.btnsellgarbage -> {
                val moveIntent = Intent(this@Homepage, ExecutionPage::class.java)
                startActivity(moveIntent)
            }
            R.id.HomePage -> {
                val moveIntent = Intent(this@Homepage, Homepage::class.java)
                startActivity(moveIntent)
            }
            R.id.ExplorePage -> {
                val moveIntent = Intent(this@Homepage, ExploreActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MapPage -> {
                val moveIntent = Intent(this@Homepage, MapActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MessagePage -> {
                val moveIntent = Intent(this@Homepage, notificationActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.ProfilPage -> {
                val moveIntent = Intent(this@Homepage, ProfilActivity ::class.java)
                startActivity(moveIntent)
            }R.id.btnBacktoHompagecreateMission -> {
            val moveIntent = Intent(this@Homepage,Homepage ::class.java)
            startActivity(moveIntent)
        }
        }
    }
}
