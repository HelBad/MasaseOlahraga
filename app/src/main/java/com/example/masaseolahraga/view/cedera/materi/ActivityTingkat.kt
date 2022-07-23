package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityTingkat : AppCompatActivity() {
    lateinit var viewMateriTingkat: WebView

    val textTingkat1 = "Graha (2009 : 12) mengemukakan bahwa Cedera tingkat I adalah cedera yang " +
            "tidak diikuti kerusakan yang berarti pada jaringan tubuh, misalnya kekuatan dari otot " +
            "dan kelelahan. Pola cedera ringan biasanya tidak diperlukan apapun dan akan sembuh " +
            "dengan sendirinya setelah istirahat beberapa waktu."
    val textTingkat2 = "Graha (2009 : 12) mengemukakan bahwa Cedera tingkat II adalah tingkatan " +
            "kerusakan jaringan lebih nyata, berpengaruh pada performa atlet, keluhan bisa berupa " +
            "nyeri, bengkak, gangguan fungsi tanda-tanda inplamasi, misalnya lebar otot, strain otot " +
            "tingkat II, sprain, tendon-tendon, robeknya ligamen (sprain grade)."
    val textTingkat3 = "Graha (2009 : 12) mengemukakan bahwa Cedera tingkat III adalah cedera yang " +
            "serius, yang ditandai adanya kerusakan jaringan pada tubuh, misalnya robek otot, " +
            "ligamen maupun fraktur atau patah tulang."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_tingkat)

        viewMateriTingkat = findViewById(R.id.viewMateriTingkat)

        if(intent.getStringExtra("materi") == "Tingkat I") {
            viewMateriTingkat.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textTingkat1 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Tingkat II") {
            viewMateriTingkat.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textTingkat2 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Tingkat III") {
            viewMateriTingkat.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textTingkat3 + "</b></p>", "text/html", "UTF-8")
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}