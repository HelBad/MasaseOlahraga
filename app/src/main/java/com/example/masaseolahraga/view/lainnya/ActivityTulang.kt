package com.example.masaseolahraga.view.lainnya

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tulang)

        spinnerTulang = findViewById(R.id.spinnerTulang)
        textTulang = findViewById(R.id.textTulang)
        imgTulang = findViewById(R.id.imgTulang)

        val listTulang = arrayOf("Seluruh Badan", "Kepala", "Leher", "Rangka Badan", "Lengan Atas",
            "Lengan Bawah", "Telapak Tangan", "Kaki")
        spinnerTulang.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listTulang)
        spinnerTulang.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textTulang.text = listTulang[position]

                if(listTulang[position] == "Seluruh Badan") {
                    imgTulang.setImageResource(R.drawable.img_tulang_badan)
                } else if(listTulang[position] == "Kepala") {
                    imgTulang.setImageResource(R.drawable.img_tulang_kepala)
                } else if(listTulang[position] == "Leher") {
                    imgTulang.setImageResource(R.drawable.img_tulang_leher)
                } else if(listTulang[position] == "Rangka Badan") {
                    imgTulang.setImageResource(R.drawable.img_tulang_rangka)
                } else if(listTulang[position] == "Lengan Atas") {
                    imgTulang.setImageResource(R.drawable.img_tulang_lenganatas)
                } else if(listTulang[position] == "Lengan Bawah") {
                    imgTulang.setImageResource(R.drawable.img_tulang_lenganbawah)
                } else if(listTulang[position] == "Telapak Tangan") {
                    imgTulang.setImageResource(R.drawable.img_tulang_tangan)
                } else if(listTulang[position] == "Kaki") {
                    imgTulang.setImageResource(R.drawable.img_tulang_kaki)
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