package com.example.masaseolahraga.view.cedera

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama
import com.example.masaseolahraga.view.cedera.materi.*

class ActivityCedera : AppCompatActivity() {
    lateinit var tingkat1Cedera: ImageView
    lateinit var tingkat2Cedera: ImageView
    lateinit var tingkat3Cedera: ImageView
    lateinit var jenis1Cedera: ImageView
    lateinit var jenis2Cedera: ImageView
    lateinit var pertolongan1Cedera: ImageView
    lateinit var pertolongan2Cedera: ImageView
    lateinit var pertolongan3Cedera: ImageView
    lateinit var pertolongan4Cedera: ImageView
    lateinit var pertolongan5Cedera: ImageView
    lateinit var pertolongan6Cedera: ImageView
    lateinit var pertolongan7Cedera: ImageView
    lateinit var pertolongan8Cedera: ImageView
    lateinit var penyebabCedera: ImageView
    lateinit var pencegahan1Cedera: ImageView
    lateinit var pencegahan2Cedera: ImageView
    lateinit var pencegahan3Cedera: ImageView
    lateinit var pencegahan4Cedera: ImageView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cedera)

        tingkat1Cedera = findViewById(R.id.tingkat1Cedera)
        tingkat2Cedera = findViewById(R.id.tingkat2Cedera)
        tingkat3Cedera = findViewById(R.id.tingkat3Cedera)
        jenis1Cedera = findViewById(R.id.jenis1Cedera)
        jenis2Cedera = findViewById(R.id.jenis2Cedera)
        pertolongan1Cedera = findViewById(R.id.pertolongan1Cedera)
        pertolongan2Cedera = findViewById(R.id.pertolongan2Cedera)
        pertolongan3Cedera = findViewById(R.id.pertolongan3Cedera)
        pertolongan4Cedera = findViewById(R.id.pertolongan4Cedera)
        pertolongan5Cedera = findViewById(R.id.pertolongan5Cedera)
        pertolongan6Cedera = findViewById(R.id.pertolongan6Cedera)
        pertolongan7Cedera = findViewById(R.id.pertolongan7Cedera)
        pertolongan8Cedera = findViewById(R.id.pertolongan8Cedera)
        penyebabCedera = findViewById(R.id.penyebabCedera)
        pencegahan1Cedera = findViewById(R.id.pencegahan1Cedera)
        pencegahan2Cedera = findViewById(R.id.pencegahan2Cedera)
        pencegahan3Cedera = findViewById(R.id.pencegahan3Cedera)
        pencegahan4Cedera = findViewById(R.id.pencegahan4Cedera)

        tingkat1Cedera.setOnClickListener {
            val intent = Intent(this, ActivityTingkat::class.java)
            intent.putExtra("materi", "Tingkat I")
            startActivity(intent)
            finish()
        }
        tingkat2Cedera.setOnClickListener {
            val intent = Intent(this, ActivityTingkat::class.java)
            intent.putExtra("materi", "Tingkat II")
            startActivity(intent)
            finish()
        }
        tingkat3Cedera.setOnClickListener {
            val intent = Intent(this, ActivityTingkat::class.java)
            intent.putExtra("materi", "Tingkat III")
            startActivity(intent)
            finish()
        }
        jenis1Cedera.setOnClickListener {
            val intent = Intent(this, ActivityJenis::class.java)
            intent.putExtra("materi", "Berdasarkan Waktu")
            startActivity(intent)
            finish()
        }
        jenis2Cedera.setOnClickListener {
            val intent = Intent(this, ActivityJenis::class.java)
            intent.putExtra("materi", "Berdasarkan Berat Ringan")
            startActivity(intent)
            finish()
        }
        pertolongan1Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Pada Kulit")
            startActivity(intent)
            finish()
        }
        pertolongan2Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Pada Otot")
            startActivity(intent)
            finish()
        }
        pertolongan3Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Patah Tulang")
            startActivity(intent)
            finish()
        }
        pertolongan4Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Pada Sendi")
            startActivity(intent)
            finish()
        }
        pertolongan5Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Fibrositis")
            startActivity(intent)
            finish()
        }
        pertolongan6Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Kuntosio")
            startActivity(intent)
            finish()
        }
        pertolongan7Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Kram Otot")
            startActivity(intent)
            finish()
        }
        pertolongan8Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPertolongan::class.java)
            intent.putExtra("materi", "Dislokasi")
            startActivity(intent)
            finish()
        }
        penyebabCedera.setOnClickListener {
            val intent = Intent(this, ActivityPenyebab::class.java)
            intent.putExtra("materi", "Penyebab")
            startActivity(intent)
            finish()
        }
        pencegahan1Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPencegahan::class.java)
            intent.putExtra("materi", "RICE")
            startActivity(intent)
            finish()
        }
        pencegahan2Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPencegahan::class.java)
            intent.putExtra("materi", "Pengobatan Medis")
            startActivity(intent)
            finish()
        }
        pencegahan3Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPencegahan::class.java)
            intent.putExtra("materi", "Fisioterapi")
            startActivity(intent)
            finish()
        }
        pencegahan4Cedera.setOnClickListener {
            val intent = Intent(this, ActivityPencegahan::class.java)
            intent.putExtra("materi", "Masase")
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