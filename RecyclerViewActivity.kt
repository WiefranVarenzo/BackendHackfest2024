package com.example.createmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.api.Distribution.BucketOptions.Linear
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    private lateinit var userList: ArrayList<User>
    private var db=Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.recycleview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        userList = arrayListOf()

        db = FirebaseFirestore.getInstance()

        db.collection("QG").get()
            .addOnSuccessListener {
                if(!it.isEmpty){
                    for (data in it.documents){
                        val user: User? =data.toObject(User::class.java)
                        if (user!=null) {
                            userList.add(user)
                        }
                    }
                    recyclerView.adapter=MyAdapter(userList)
                }
            }
            .addOnFailureListener{
                Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}