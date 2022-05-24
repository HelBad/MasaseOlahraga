package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityPencegahan : AppCompatActivity() {
    lateinit var viewMateriPencegahan: WebView

    val textPencegahan1 = "Asep (2013: 47) menjelaskan RICE merupakan tindakan penanganan dini " +
            "cedera olahraga yang berupa rest pemberian waktu istirahat yang diberikan pada " +
            "seseorang yang mengalami cedera. Ice merupakan tindakan pemberian es pada bagian yang " +
            "mengalami cedera berguna untuk vasokontriks. Compression merupakan pemberian tekanan " +
            "ringan pada tubuh yang mengalami cedera untuk membatasi bengkak. Elevation merupakan " +
            "tindakan meninggikan bagian tubuh yang cedera lebih tinggi dari jantung berguna untuk " +
            "membantu darah kembali ke jantung."
    val textPencegahan2 = "Penanganan medis menggunakan obat-obatan banyak dipergunakan dalam " +
            "penatalaksanaan cedera olahraga yang bertujuan mengurangi nyeri atau peradangan. " +
            "Menurut Giam (1992: 164) obat-obatan yang dipergunakan dalam penatalaksanaan cedera " +
            "olahraga dapat dibagi kedalam golongan yang diberikan pada kulit (topikal), yang " +
            "diberikan secara oral dan yang melalui suntikan. Sedangkan penanganan menggunakan " +
            "pembedahan (operasi) cukup jarang dilakukan jika cedera yang dialami benar-benar parah " +
            "dan tidak dapat tertolong menggunakan cara-cara pengobatan lain."
    val textPencegahan3 = "Fisioterapi dapat diartikan sebagai penggunaan sarana atau media terapi " +
            "untuk menghasilkan suatu respon penyembuhan dan rehablitasi pada cedera ataupun " +
            "masalah-masalah medis lain yang berhubungan dengan olahraga (Giam, 1992: 167)."
    val textPencegahan4 = "Menurut Giam (1992: 167) masase adalah manipulasi jaringan lunak tubuh. " +
            "Manipulasi ini paling efektif dilakukan dengan tangan dan dilakukan dengan tujuan agar " +
            "mempunyai pengaruh pada sistem syaraf, otot, dan pernapasan sirkulasi darah dan limfe " +
            "secara lokal maupun umum. Massage tidak boleh dilakukan sebelum 14 jam dari cedera, " +
            "karena hal tersebut akan menghambat penyembuhan dan mengakibatkan pembengkakan. " +
            "Penggunaan massage yang lembut dan ringan, kurang lebih satu minggu setelah trauma " +
            "mungkin dapat mengatasi rasa nyeri tersebut, dengan syarat diberikan dengan betul dan " +
            "dengan dasar ilmiah maka efektif untuk mengurangi bengkak dan kekakuan otot."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_pencegahan)

        viewMateriPencegahan = findViewById(R.id.viewMateriPencegahan)

        if(intent.getStringExtra("materi") == "RICE") {
            viewMateriPencegahan.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPencegahan1 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Pengobatan Medis") {
            viewMateriPencegahan.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPencegahan2 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Fisioterapi") {
            viewMateriPencegahan.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPencegahan3 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Masase") {
            viewMateriPencegahan.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPencegahan4 + "</b></p>", "text/html", "UTF-8")
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}