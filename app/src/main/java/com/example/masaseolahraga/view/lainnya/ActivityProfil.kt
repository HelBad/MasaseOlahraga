package com.example.masaseolahraga.view.lainnya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama

class ActivityProfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityUtama::class.java)
        startActivity(intent)
        finish()
    }
}