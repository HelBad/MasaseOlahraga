package com.example.masaseolahraga.view.teknik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama

class ActivityTeknik : AppCompatActivity() {
    lateinit var duduk1Teknik: ImageView
    lateinit var duduk2Teknik: ImageView
    lateinit var duduk3Teknik: ImageView
    lateinit var anterior1Teknik: ImageView
    lateinit var anterior2Teknik: ImageView
    lateinit var anterior3Teknik: ImageView
    lateinit var anterior4Teknik: ImageView
    lateinit var posterior1Teknik: ImageView
    lateinit var posterior2Teknik: ImageView
    lateinit var posterior3Teknik: ImageView
    lateinit var posterior4Teknik: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik)

        duduk1Teknik = findViewById(R.id.duduk1Teknik)
        duduk2Teknik = findViewById(R.id.duduk2Teknik)
        duduk3Teknik = findViewById(R.id.duduk3Teknik)
        anterior1Teknik = findViewById(R.id.anterior1Teknik)
        anterior2Teknik = findViewById(R.id.anterior2Teknik)
        anterior3Teknik = findViewById(R.id.anterior3Teknik)
        anterior4Teknik = findViewById(R.id.anterior4Teknik)
        posterior1Teknik = findViewById(R.id.posterior1Teknik)
        posterior2Teknik = findViewById(R.id.posterior2Teknik)
        posterior3Teknik = findViewById(R.id.posterior3Teknik)
        posterior4Teknik = findViewById(R.id.posterior4Teknik)

        duduk1Teknik.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "kepala")
            startActivity(intent)
            finish()
        }
        duduk2Teknik.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "leher")
            startActivity(intent)
            finish()
        }
        duduk3Teknik.setOnClickListener {  }
        anterior1Teknik.setOnClickListener {  }
        anterior2Teknik.setOnClickListener {  }
        anterior3Teknik.setOnClickListener {  }
        anterior4Teknik.setOnClickListener {  }
        posterior1Teknik.setOnClickListener {  }
        posterior2Teknik.setOnClickListener {  }
        posterior3Teknik.setOnClickListener {  }
        posterior4Teknik.setOnClickListener {  }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityUtama::class.java)
        startActivity(intent)
        finish()
    }
}