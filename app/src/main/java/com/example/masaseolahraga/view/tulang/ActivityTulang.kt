package com.example.masaseolahraga.view.tulang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.ActivityUtama
import com.github.chrisbanes.photoview.PhotoView

class ActivityTulang : AppCompatActivity() {
    lateinit var spinnerTulang: Spinner
    lateinit var textTulang: TextView
    lateinit var imgTulang: PhotoView
    lateinit var btnDepan: Button
    lateinit var btnBelakang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tulang)

        spinnerTulang = findViewById(R.id.spinnerTulang)
        textTulang = findViewById(R.id.textTulang)
        imgTulang = findViewById(R.id.imgTulang)
        btnDepan = findViewById(R.id.btnDepan)
        btnBelakang = findViewById(R.id.btnBelakang)

        val listTulang = arrayOf("Seluruh Badan", "Kepala", "Rangka", "Lengan Atas Bawah", "Telapak Tangan", "Telapak Kaki", "Tungkai Atas Bawah")
        spinnerTulang.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTulang)
        spinnerTulang.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textTulang.text = listTulang[position]

                if(listTulang[position] == "Seluruh Badan") {
                    imgTulang.setImageResource(R.drawable.tes_1)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgTulang.setImageResource(R.drawable.tes_3)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                    }
                    btnDepan.setOnClickListener {
                        imgTulang.setImageResource(R.drawable.tes_1)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                    }
                } else if(listTulang[position] == "Kepala") {
                    imgTulang.setImageResource(R.drawable.tes_2)
                    btnDepan.visibility = View.GONE
                    btnBelakang.visibility = View.VISIBLE
                    btnBelakang.setOnClickListener {
                        imgTulang.setImageResource(R.drawable.tes_3)
                        btnDepan.visibility = View.VISIBLE
                        btnBelakang.visibility = View.GONE
                    }
                    btnDepan.setOnClickListener {
                        imgTulang.setImageResource(R.drawable.tes_2)
                        btnDepan.visibility = View.GONE
                        btnBelakang.visibility = View.VISIBLE
                    }
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