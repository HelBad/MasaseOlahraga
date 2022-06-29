package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityRiceHarm : AppCompatActivity() {
    lateinit var imgMateriRiceharm: ImageView
    lateinit var viewMateriRiceharm1: WebView
    lateinit var viewMateriRiceharm2: WebView
    lateinit var viewMateriRiceharm3: WebView
    lateinit var viewMateriRiceharm4: WebView
    lateinit var viewMateriRiceharm5: WebView

    val textRice1 = "Asep (2013: 47) menjelaskan RICE merupakan tindakan penanganan dini cedera " +
            "olahraga yang berupa rest pemberian waktu istirahat yang diberikan pada seseorang yang " +
            "mengalami cedera. Ice merupakan tindakan pemberian es pada bagian yang mengalami cedera " +
            "berguna untuk vasokontriks. Compression merupakan pemberian tekanan ringan pada tubuh " +
            "yang mengalami cedera untuk membatasi bengkak. Elevation merupakan tindakan meninggikan " +
            "bagian tubuh yang cedera lebih tinggi dari jantung berguna untuk membantu darah kembali " +
            "ke jantung. Tips penanganan cedera (Sport First Aid, 2009) Segera Setelah Terjadi " +
            "Cedera (0 sampai dengan 36 jam) Penanganan Pertama yang dilakukan ialah dengan " +
            "menggunakan metode RICE, yaitu :"
    val textRice2 = "Rest. Segera istirahatkan bagian yang cedera untuk mencegah bertambah parahnya " +
            "cedera dan mengurangi aliran darah (pendarahan) ke area cedera. Waktu istirahat " +
            "tergantung berat ringannya cedera."
    val textRice3 = "Ice. Tujuannya melokalisir cedera, mematirasakan ujung syaraf sehingga dapat " +
            "mengurangi nyeri, mencegah pembengkakan, mengurangi pendarahan. Cara sebagai berikut : " +
            "a) Es ditempatkan pada handuk atau kantong, kemudian diletakan dibagian cedera. b) " +
            "Dilakukan 2-3 menit sampai rasa sakit hilang. c) Interval pembengkakan dapat berkurang " +
            "20-30 menit setelah melakukan. d) Bisa juga menggunakan chlorethyl spray, yaitu zat " +
            "kimia dingin."
    val textRice4 = "Compression. Tujuannya adalah untuk mengurangi pembengkakan sebagai akibat " +
            "pendarahan dan untuk mengurangi pembengkakan. Balut menggunakan bahan elastis seperti " +
            "elastic bandage, tensio krep, dan usahakan ikatan nyaman dan jangan terlalu kencang."
    val textRice5 = "Elevation. Tujuannya adalah mengurangi pendarahan dan mengurngi pembengkakan. " +
            "Dengan mengangkat bagian cedera lebih tinggi dari letak jantung, sehingga aliran darah " +
            "arteri menjadi lambat dan aliran darah vena menjadi lancar."
    val textHarm1 = "Adapun yang perlu diketahui dalam menagani cedera baru (0-36 jam) jangan " +
            "melakukan HARM, yaitu :"
    val textHarm2 = "Heat. Kompres panas tidak boleh dilakukan karena akan menyebabkan peningkatan " +
            "aliran darah ke bagian cedera sehingga menyebabkan pembengkakan semakin parah."
    val textHarm3 = "Alcohol. Merendam daerah yang cedera dengan alcohol dan meminum minuman yang " +
            "mengandung alcohol akan memperparah bagian yang cedera dan menyebabkan pembengkakan " +
            "semakin parah."
    val textHarm4 = "Running. Jangan mencoba berlari, hal ini dapat memperparah bagian yang cedera."
    val textHarm5 = "Massage. Tidak melakukan massage dibagian titik terjadinya cedera apalagi " +
            "pada saat baru terjadi cedera. Karena akan memperparah cedera sehingga penyembuhan " +
            "tidak akan maksimal."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_riceharm)

        imgMateriRiceharm = findViewById(R.id.imgMateriRiceharm)
        viewMateriRiceharm1 = findViewById(R.id.viewMateriRiceharm1)
        viewMateriRiceharm2 = findViewById(R.id.viewMateriRiceharm2)
        viewMateriRiceharm3 = findViewById(R.id.viewMateriRiceharm3)
        viewMateriRiceharm4 = findViewById(R.id.viewMateriRiceharm4)
        viewMateriRiceharm5 = findViewById(R.id.viewMateriRiceharm5)

        if(intent.getStringExtra("materi") == "RICE") {
            imgMateriRiceharm.setImageResource(R.drawable.img_cedera_pencegahan_rice)
            viewMateriRiceharm1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textRice1 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textRice2 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textRice3 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textRice4 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textRice5 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "HARM") {
            imgMateriRiceharm.setImageResource(R.drawable.img_cedera_pencegahan_harm)
            viewMateriRiceharm1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textHarm1 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textHarm2 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textHarm3 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textHarm4 + "</b></p>", "text/html", "UTF-8")
            viewMateriRiceharm5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textHarm5 + "</b></p>", "text/html", "UTF-8")
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}