package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityJenis : AppCompatActivity() {
    lateinit var viewMateriJenis1: WebView
    lateinit var viewMateriJenis2: WebView

    val textJenisWaktu1 = "Cedera akut adalah cedera berat yang terjadi secara mendadak dan " +
            "tiba-tiba seperti : cedera goresan, robek pada ligament, atau patah tulang karena " +
            "terjatuh. Tanda dan gejalanya : sakit, nyeri, kemerahan pada kulit."
    val textJenisWaktu2 = "Cedera kronis adalah suatu cedera yang terjadi atau berkembang secara " +
            "lambat seperti : cedera pada otot hamstring yang mengalami cedera yang berulang-ulang " +
            "yang dapat menjadi semakin parah. tanda dan gejalanya : gejala yang sakit timbul dapat " +
            "hilang dalam beberapa waktu tertentu namun dapat timbul kembali."
    val textJenisBerat1 = "Cedera ringan adalah cedera yang tidak diikuti kerusakan yang berarti pada " +
            "jaringan tubuh misalnya : kekauan otot dan kelelahan otot. Cara penanganan cedera ini " +
            "tidak diperlukan pengobatan yang khusus karena akan sembuh dengan sendirinya setelah " +
            "istirahat beberapa waktu."
    val textJenisBerat2 = "Cedera berat adalah cedera yang serius dimana pada cedera tersebut " +
            "ditemukan adanya kerusakan pada jaringan tubuh misalnya : robeknya otot, robeknya " +
            "ligament, maupun patah pulang (fraktur). Cedera ini perlu penanganan ahli lebih lanjut."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_jenis)

        viewMateriJenis1 = findViewById(R.id.viewMateriJenis1)
        viewMateriJenis2 = findViewById(R.id.viewMateriJenis2)

        if(intent.getStringExtra("materi") == "Berdasarkan Waktu") {
            viewMateriJenis1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textJenisWaktu1 + "</b></p>", "text/html", "UTF-8")
            viewMateriJenis2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textJenisWaktu2 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Berdasarkan Berat Ringan") {
            viewMateriJenis1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textJenisBerat1 + "</b></p>", "text/html", "UTF-8")
            viewMateriJenis2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textJenisBerat2 + "</b></p>", "text/html", "UTF-8")
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}