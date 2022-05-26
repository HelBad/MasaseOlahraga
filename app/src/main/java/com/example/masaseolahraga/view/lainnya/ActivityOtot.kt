package com.example.masaseolahraga.view.lainnya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama
import com.github.chrisbanes.photoview.PhotoView

class ActivityOtot : AppCompatActivity() {
    lateinit var spinnerOtot: Spinner
    lateinit var textOtot: TextView
    lateinit var imgOtot: PhotoView
    lateinit var btnDepan: Button
    lateinit var btnBelakang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otot)

        spinnerOtot = findViewById(R.id.spinnerOtot)
        textOtot = findViewById(R.id.textOtot)
        imgOtot = findViewById(R.id.imgOtot)
        btnDepan = findViewById(R.id.btnDepan)
        btnBelakang = findViewById(R.id.btnBelakang)

        val listOtot = arrayOf("Seluruh Badan", "Kepala", "Rangka Badan", "Lengan", "Telapak Tangan",
            "Kaki", "Pergelangan Kaki")
        spinnerOtot.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOtot)
        spinnerOtot.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textOtot.text = listOtot[position]

                if(listOtot[position] == "Seluruh Badan") {
                    imgOtot.setImageResource(R.drawable.img_otot_badan_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_badan_2)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                        Toast.makeText(this@ActivityOtot, "Tampak Belakang", Toast.LENGTH_SHORT).show()
                    }
                    btnDepan.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_badan_1)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                        Toast.makeText(this@ActivityOtot, "Tampak Depan", Toast.LENGTH_SHORT).show()
                    }
                } else if(listOtot[position] == "Kepala") {
                    imgOtot.setImageResource(R.drawable.img_otot_kepala)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.GONE
                } else if(listOtot[position] == "Rangka Badan") {
                    imgOtot.setImageResource(R.drawable.img_otot_rangka_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_rangka_2)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                        Toast.makeText(this@ActivityOtot, "Tampak Belakang", Toast.LENGTH_SHORT).show()
                    }
                    btnDepan.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_rangka_1)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                        Toast.makeText(this@ActivityOtot, "Tampak Depan", Toast.LENGTH_SHORT).show()
                    }
                } else if(listOtot[position] == "Lengan") {
                    imgOtot.setImageResource(R.drawable.img_otot_lengan_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_lengan_2)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                        Toast.makeText(this@ActivityOtot, "Tampak Belakang", Toast.LENGTH_SHORT).show()
                    }
                    btnDepan.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_lengan_1)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                        Toast.makeText(this@ActivityOtot, "Tampak Depan", Toast.LENGTH_SHORT).show()
                    }
                } else if(listOtot[position] == "Telapak Tangan") {
                    imgOtot.setImageResource(R.drawable.img_otot_tangan_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_tangan_2)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                        Toast.makeText(this@ActivityOtot, "Tampak Belakang", Toast.LENGTH_SHORT).show()
                    }
                    btnDepan.setOnClickListener {
                        imgOtot.setImageResource(R.drawable.img_otot_tangan_1)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                        Toast.makeText(this@ActivityOtot, "Tampak Depan", Toast.LENGTH_SHORT).show()
                    }
                } else if(listOtot[position] == "Kaki") {
                    imgOtot.setImageResource(R.drawable.img_otot_kaki_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.GONE
                } else if(listOtot[position] == "Pergelangan Kaki") {
                    imgOtot.setImageResource(R.drawable.img_otot_kaki_2)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.GONE
                }
            }
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityUtama::class.java)
        startActivity(intent)
        finish()
    }
}