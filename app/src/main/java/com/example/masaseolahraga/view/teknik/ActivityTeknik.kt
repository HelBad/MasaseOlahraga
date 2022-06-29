package com.example.masaseolahraga.view.teknik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama

class ActivityTeknik : AppCompatActivity() {
    lateinit var btnTeknik1: ImageView
    lateinit var btnTeknik2: ImageView
    lateinit var btnTeknik3: ImageView
    lateinit var btnTeknik4: ImageView
    lateinit var btnTeknik5: ImageView
    lateinit var btnTeknik6: ImageView
    lateinit var btnTeknik7: ImageView
    lateinit var btnTeknik8: ImageView
    lateinit var btnTeknik9: ImageView
    lateinit var btnTeknik10: ImageView
    lateinit var btnTeknik11: ImageView
    lateinit var btnTeknik12: ImageView
    lateinit var btnTeknik13: ImageView
    lateinit var btnTeknik14: ImageView
    lateinit var btnTeknik15: ImageView
    lateinit var btnTeknik16: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teknik)

        btnTeknik1 = findViewById(R.id.btnTeknik1)
        btnTeknik2 = findViewById(R.id.btnTeknik2)
        btnTeknik3 = findViewById(R.id.btnTeknik3)
        btnTeknik4 = findViewById(R.id.btnTeknik4)
        btnTeknik5 = findViewById(R.id.btnTeknik5)
        btnTeknik6 = findViewById(R.id.btnTeknik6)
        btnTeknik7 = findViewById(R.id.btnTeknik7)
        btnTeknik8 = findViewById(R.id.btnTeknik8)
        btnTeknik9 = findViewById(R.id.btnTeknik9)
        btnTeknik10 = findViewById(R.id.btnTeknik10)
        btnTeknik11 = findViewById(R.id.btnTeknik11)
        btnTeknik12 = findViewById(R.id.btnTeknik12)
        btnTeknik13 = findViewById(R.id.btnTeknik13)
        btnTeknik14 = findViewById(R.id.btnTeknik14)
        btnTeknik15 = findViewById(R.id.btnTeknik15)
        btnTeknik16 = findViewById(R.id.btnTeknik16)

        btnTeknik1.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik1")
            startActivity(intent)
            finish()
        }
        btnTeknik2.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik2")
            startActivity(intent)
            finish()
        }
        btnTeknik3.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik3")
            startActivity(intent)
            finish()
        }
        btnTeknik4.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik4")
            startActivity(intent)
            finish()
        }
        btnTeknik5.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik5")
            startActivity(intent)
            finish()
        }
        btnTeknik6.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik6")
            startActivity(intent)
            finish()
        }
        btnTeknik7.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik7")
            startActivity(intent)
            finish()
        }
        btnTeknik8.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik8")
            startActivity(intent)
            finish()
        }
        btnTeknik9.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik9")
            startActivity(intent)
            finish()
        }
        btnTeknik10.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik10")
            startActivity(intent)
            finish()
        }
        btnTeknik11.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik11")
            startActivity(intent)
            finish()
        }
        btnTeknik12.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik12")
            startActivity(intent)
            finish()
        }
        btnTeknik13.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik13")
            startActivity(intent)
            finish()
        }
        btnTeknik14.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik14")
            startActivity(intent)
            finish()
        }
        btnTeknik15.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik15")
            startActivity(intent)
            finish()
        }
        btnTeknik16.setOnClickListener {
            val intent = Intent(this, ActivityVideo::class.java)
            intent.putExtra("judul", "teknik16")
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityUtama::class.java)
        startActivity(intent)
        finish()
    }
}