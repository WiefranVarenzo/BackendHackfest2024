package com.example.createmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.createmission.databinding.ActivityCreateMissionBinding
import com.example.createmission.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.firestore
import com.google.firebase.ktx.Firebase


class create_mission : AppCompatActivity(), View.OnClickListener {
    private var db= com.google.firebase.Firebase.firestore
    private var sKuantitas = ""
    private var sHarga = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Correct the inflation and set the content view
        setContentView(R.layout.activity_create_mission)

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
        val btnBack: TextView = findViewById(R.id.btnBacktoHompagecreateMission)
        btnBack.setOnClickListener(this)


        val BerikanKomentar: EditText = findViewById(R.id.berikanKomentar)
        val namaQG: EditText = findViewById(R.id.nama_QG)
        val lokasiMisi: EditText = findViewById(R.id.lokasi_misi)
        val KeteranganTambahan: EditText = findViewById(R.id.keterangaTambahanMisi)
        val btnSimpan: Button = findViewById(R.id.SimpanMission)
        val btnKuantitasKecil: Button = findViewById(R.id.KuntitasKecil)
        val btnKuantitasSedang: Button = findViewById(R.id.KuantitasSedang)
        val btnKuantitasBesar: Button = findViewById(R.id.KuantitasBesar)
        val btn10rb: Button = findViewById(R.id.login_button10rb)
        val btn20rb: Button = findViewById(R.id.login_button20rb)
        val btn30rb: Button = findViewById(R.id.login_button30rb)

        btnKuantitasKecil.setOnClickListener {
            sKuantitas = "Kecil"
        }

        btnKuantitasSedang.setOnClickListener {
            sKuantitas = "Sedang"
        }

        btnKuantitasBesar.setOnClickListener {
            sKuantitas = "Besar"
        }
        btn10rb.setOnClickListener {
            sHarga = "10.000"
        }

        btn20rb.setOnClickListener {
            sHarga= "20.000"
        }

        btn30rb.setOnClickListener {
            sHarga = "30.000"
        }

        btnSimpan.setOnClickListener {
            val sNamaQG = namaQG.text.toString().trim()
            val slokasiMisi = lokasiMisi.text.toString().trim()
            val sKeteranganTambahan = KeteranganTambahan.text.toString().trim()
            val sBerikanKomentar = BerikanKomentar.text.toString().trim()


                val Misi = hashMapOf(
                    "berikan_komentar" to sBerikanKomentar,
                    "name" to sNamaQG,
                    "location" to slokasiMisi,
                    "keterangan_tambahan" to sKeteranganTambahan,
                    "kuantitas" to sKuantitas,
                    "harga" to sHarga
                )

                val userId = FirebaseAuth.getInstance().currentUser!!.uid

                db.collection("QG").document().set(Misi)
                    .addOnCompleteListener {
                        Toast.makeText(this, "succesfullly Added!", Toast.LENGTH_SHORT).show()
                        namaQG.text.clear()
                        lokasiMisi.text.clear()
                        KeteranganTambahan.text.clear()
                        BerikanKomentar.text.clear()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                    }

        }
    }

    override fun onClick(v: View) {
        when (v?.id) {
            // Correct the ID to match the actual ID of the button
            R.id.HomePage -> {
                val moveIntent = Intent(this@create_mission, Homepage::class.java)
                startActivity(moveIntent)
            }
            R.id.ExplorePage -> {
                val moveIntent = Intent(this@create_mission, ExploreActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MapPage -> {
                val moveIntent = Intent(this@create_mission, MapActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.MessagePage -> {
                val moveIntent = Intent(this@create_mission, notificationActivity ::class.java)
                startActivity(moveIntent)
            }
            R.id.ProfilPage -> {
                val moveIntent = Intent(this@create_mission, ProfilActivity ::class.java)
                startActivity(moveIntent)
            }R.id.btnBacktoHompagecreateMission -> {
            val moveIntent = Intent(this@create_mission,Homepage ::class.java)
            startActivity(moveIntent)
        }

        }
    }
}
