package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityPenyebab : AppCompatActivity() {
    lateinit var viewMateriPenyebab1: WebView
    lateinit var viewMateriPenyebab2: WebView
    lateinit var viewMateriPenyebab3: WebView
    lateinit var viewMateriPenyebab4: WebView
    lateinit var viewMateriPenyebab5: WebView
    lateinit var viewMateriPenyebab6: WebView
    lateinit var viewMateriPenyebab7: WebView
    lateinit var viewMateriPenyebab8: WebView
    lateinit var viewMateriPenyebab9: WebView
    lateinit var viewMateriPenyebab10: WebView
    lateinit var viewMateriPenyebab11: WebView
    lateinit var viewMateriPenyebab12: WebView
    lateinit var viewMateriPenyebab13: WebView
    lateinit var viewMateriPenyebab14: WebView
    lateinit var viewMateriPenyebab15: WebView
    lateinit var viewMateriPenyebab16: WebView
    lateinit var viewMateriPenyebab17: WebView
    lateinit var viewMateriPenyebab18: WebView
    lateinit var viewMateriPenyebab19: WebView
    lateinit var viewMateriPenyebab20: WebView
    lateinit var viewMateriPenyebab21: WebView
    lateinit var viewMateriPenyebab22: WebView
    lateinit var viewMateriPenyebab23: WebView
    lateinit var viewMateriPenyebab24: WebView
    lateinit var viewMateriPenyebab25: WebView
    lateinit var viewMateriPenyebab26: WebView
    lateinit var viewMateriPenyebab27: WebView
    lateinit var viewMateriPenyebab28: WebView
    lateinit var viewMateriPenyebab29: WebView
    lateinit var viewMateriPenyebab30: WebView

    val textPenyebab1 = "Cedera bukan sesuatu yang terjadi begitu saja, melainkan ada penyebabnya. " +
            "Cedera olahraga disebabkan oleh berbagai faktor antara lain kesalahan metode latihan, " +
            "kelainan struktural maupun kelemahan fisiologis fungsi jaringan penyokong dan otot " +
            "(Bahr, 2003). Adapun penyebab cedera di bagi menjadi dua, yaitu :"
    val textPenyebab2 = "Faktor resiko internal (sebab-sebab yang berasal dari dalam)"
    val textPenyebab3 = "Cedera ini terjadi karena koordinasi otot-otot dan sendi yang kurang " +
            "sempurna, sehingga menimbulkan gerakan yang salah, sehingga menimbulkan cedera. " +
            "Misalnya ukuran kaki atau tungkai yang tidak sama panjangnya, kekuatan otot-otot yang " +
            "bersifat antagonistis tidak seimbang, dan sebagainya. Hal itu juga bisa terjadi karena " +
            "kurang pemanasan, kurang konsentrasi ataupun atlet dalam keadaan fisik dan mental yang " +
            "lemah (Macamnya cedera bisa berupa robeknya otot, tendo, atau ligamentum)."
    val textPenyebab4 = "Faktor resiko eksternal (sebab-sebab yang berasal dari luar)"
    val textPenyebab5 = "Eksternal violence adalah cedera yang timbul atau terjadi karena pengaruh " +
            "atau sebab yang berasal dari luar, misalnya : 1) Body contact sport : sepak bola, " +
            "tinju, karate, dan lain-lain. 2) Alat-alat olahraga : stick hockey, bola, raket dan " +
            "lain-lain. 3) Keadaan sekitarnya yang menyebabkan terjadinya cedera seperti : cuaca " +
            "atau keadaan lapangan yang tidak memenuhi persyaratan."
    val textPenyebab6 = "Faktor-faktor penyebab terjadinya cedera olahraga menurut (Congeni, 2004) " +
            "sebagai berikut :"
    val textPenyebab7 = "Faktor Eksogen, yang terdiri dari : 1) Cara pemberian beban latihan yang " +
            "salah, pemanasan yang salah, cara latihan yang salah, latihan yang tidak teratur. 2) " +
            "Penggunaan material yang salah. 3) Fasilitas latihan yang tidak memadai. 4) Jenis " +
            "Olahraga."
    val textPenyebab8 = "Faktor Endogen, misalnya : faktor disposisi keluarga, kondisi umum buruk, " +
            "penyakit infeksi, kelainan sistem muskuloskeletal, usia, dan cara bergerak yang tidak " +
            "fisiologis. Pendapat lain mengatakan bahwa cedera yang terjadi pada waktu berolahraga " +
            "disebabkan oleh beberapa hal, yaitu : (1) kecelakaan, (2) pelaksanaan latihan yang " +
            "kurang baik, (3) peralatan yang tidak sesuai, (4) kurang persiapan kondisi fisik, dan " +
            "(5) pemanasan dan peragangan yang memadai (Dunkin, 2004). Pendapat yang sama juga " +
            "disampaikan oleh pakar lainnya yang mengatakan bahwa penyebab terjadinya cedera adalah " +
            ": (1) latihan yang tidak baik, (2) pemakaian perlengkapan keselamatan yang kurang " +
            "sesuai, dan (3) pemaikaian alas kaki yang tidak cocok atau tidak sesuai."
    val textPenyebab9 = "Menurut Graha (2012) Ada dua jenis cedera yang sering dialami oleh atlet, " +
            "yaitu trauma akut dan sindrom pemakaian berlebih (overuse syndrome). Trauma akut " +
            "adalah suatu cedera berat yang terjadi secara mendadak, seperti robekan ligamen, otot, " +
            "tendo, atau terkilir, atau bahkan patah tulang. Cedera akut biasa memerlukan " +
            "pertolongan profesional. Sindrom pemakaian berlebih sering dialami oleh atlet yang " +
            "bermula dari adanya suatu kekuatan yang sedikit berlebihan, tetapi berlangsung " +
            "berulang-ulang dalam jangka waktu lama. Sindrom itu kadang memberi respon yang baik " +
            "dengan pengobatan sendiri. Sedangkan menurut Widhiyanti (2018 : 7) penyebab cedera " +
            "sebagai berikut :"
    val textPenyebab10 = "Dari dalam (Internal Violence), Cedera yang terjadi karena adanya " +
            "rangsangan atau pengaruh yang berasal dari dalam individu itu sendiri, misalnya :"
    val textPenyebab11 = "Koordinasi otot-otot dan sendi yang kurang sempurna, sehingga menimbulkan " +
            "gerakan-gerakan yang salah."
    val textPenyebab12 = "Kelainan struktural tubuh (ukuran tungkai atau kaki yang tidak sama " +
            "panjangnya)."
    val textPenyebab13 = "Kurangnya melakukan pemanasan (warming up)."
    val textPenyebab14 = "Kurang konsentrasi."
    val textPenyebab15 = "Keadaan fisik dan mental yang lemah."
    val textPenyebab16 = "Kelemahan pada otot, tendon, ligamen."
    val textPenyebab17 = "Umur, kekuatan otot pada pubertas 70-80% dan mencapai puncaknya pada usia " +
            "25-30 tahun, selanjutnya mengalami penurunan secara bertahap sebagai berikut : usia 30 " +
            "tahun seseorang akan kehilangan 3-5% jaringan otot total setiap 10 tahun. Pada usia 65 " +
            "tahun kekuatan otot tinggal 65-70%."
    val textPenyebab18 = "Keterampilan atau kemampuan seseorang yang masih rendah akan lebih mudah " +
            "dan lebih sering mengalami cedera."
    val textPenyebab19 = "Cedera yang timbul berupa robeknya otot, tendon, dan ligament."
    val textPenyebab20 = "Dari luar (Eksternal Violence), Cedera yang terjadi karena adanya " +
            "pengaruh dari faktor luar individu yang memberikan pengaruh terhadap dirinya sendiri."
    val textPenyebab21 = "Sentuhan badan dalam olahraga (body contact sport) misalnya : sepak bola, " +
            "futsal, tinju, karate dan sebagainya."
    val textPenyebab22 = "Alat-alat olahraga misalnya bola, raket, sepatu, pelindung tubuh, dan " +
            "lain-lain."
    val textPenyebab23 = "Kondisi lapangan."
    val textPenyebab24 = "Kondisi lingkungan, yang berkaitan dengan cuaca dingin atau panas."
    val textPenyebab25 = "Keseimbangan gizi yang baik dapat mengecilkan kemungkinan resiko cedera " +
            "dan dapat mempercepat proses penyembuhan cedera."
    val textPenyebab26 = "Penonton yang fanatik yang dapat melakukan tindakan berbahaya."
    val textPenyebab27 = "Wasit yang kurang tegas dalam pertandingan dan kurang memahami peraturan."
    val textPenyebab28 = "Cedera yang timbul berupa robeknya otot, tendon, dan ligament."
    val textPenyebab29 = "Pemakaian otot dan tendon yang berlebihan atau terlalu lelah (overuse), " +
            "Koordinasi otot yang terus menerus akan mengakibatkan otot dan tendon yang digunakan " +
            "untuk aktivitas olahraga. Tendon adalah sekumpulan jaringan ikat beserat yang " +
            "menghubungkan jaringan otot dengan tulang. Sedangkan otot adalah sebuah jaringan yang " +
            "berfungsi sebagai alat gerak aktif yang menggerakan tulang."
    val textPenyebab30 = "Cedera olahraga sering kali direspon oleh tubuh dengan tanda radang yang " +
            "terdiri atas merah (rubor), bengkak (tumor), panas (kalor), nyeri (dolor), dan " +
            "penurunan fungsi (functiolaesa). Pembuluh darah di lokasi cedera akan melebar " +
            "(vasodilatasi) dengan maksud untuk mengirim lebih banyak nutrisi dan oksigen dalam " +
            "mendukung penyembuhan. Pelebaran pembuluh darah itulah yang mengakibatkan lokasi " +
            "cedera terlihat lebih merah (rubor). Cairan darah yang banyak dikirim di lokasi cedera " +
            "akan merembes ke luar dari kapiler menuju ruang antar sel dan menyebabkan bengkak " +
            "(tumor). Dengan dukungan banyak nutrisi dan oksigen, metabolisme di lokasi cedera akan " +
            "meningkat dengan sisa metabolisme yang berupa panas. Kondisi itulah yang menyebabkan " +
            "lokasi cedera akan lebih panas (kalor) dibandingkan dengan lokasi lain. Tumpukan sisa " +
            "metabolisme dan zat kimia lain akan merangsang ujung saraf di lokasi cedera dan " +
            "menimbulkan nyeri (dolor). Rasa nyeri juga dipicu oleh tertekannya ujung saraf karena " +
            "pembengkakan yang terjadi di lokasi cedera. Baik rubor, tumor, kalor, maupun dolor " +
            "akan menurunkan fungsi organ atau sendi di lokasi cedera yang dikenal dengan istilah " +
            "penurunan fungsi atau functiolaesa. Dengan mengacu pada tanda-tanda radang, penanganan " +
            "cedera akut yang disarankan adalah rest, ice, compression, and elevation (RICE)."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_penyebab)

        viewMateriPenyebab1 = findViewById(R.id.viewMateriPenyebab1)
        viewMateriPenyebab2 = findViewById(R.id.viewMateriPenyebab2)
        viewMateriPenyebab3 = findViewById(R.id.viewMateriPenyebab3)
        viewMateriPenyebab4 = findViewById(R.id.viewMateriPenyebab4)
        viewMateriPenyebab5 = findViewById(R.id.viewMateriPenyebab5)
        viewMateriPenyebab6 = findViewById(R.id.viewMateriPenyebab6)
        viewMateriPenyebab7 = findViewById(R.id.viewMateriPenyebab7)
        viewMateriPenyebab8 = findViewById(R.id.viewMateriPenyebab8)
        viewMateriPenyebab9 = findViewById(R.id.viewMateriPenyebab9)
        viewMateriPenyebab10 = findViewById(R.id.viewMateriPenyebab10)
        viewMateriPenyebab11 = findViewById(R.id.viewMateriPenyebab11)
        viewMateriPenyebab12 = findViewById(R.id.viewMateriPenyebab12)
        viewMateriPenyebab13 = findViewById(R.id.viewMateriPenyebab13)
        viewMateriPenyebab14 = findViewById(R.id.viewMateriPenyebab14)
        viewMateriPenyebab15 = findViewById(R.id.viewMateriPenyebab15)
        viewMateriPenyebab16 = findViewById(R.id.viewMateriPenyebab16)
        viewMateriPenyebab17 = findViewById(R.id.viewMateriPenyebab17)
        viewMateriPenyebab18 = findViewById(R.id.viewMateriPenyebab18)
        viewMateriPenyebab19 = findViewById(R.id.viewMateriPenyebab19)
        viewMateriPenyebab20 = findViewById(R.id.viewMateriPenyebab20)
        viewMateriPenyebab21 = findViewById(R.id.viewMateriPenyebab21)
        viewMateriPenyebab22 = findViewById(R.id.viewMateriPenyebab22)
        viewMateriPenyebab23 = findViewById(R.id.viewMateriPenyebab23)
        viewMateriPenyebab24 = findViewById(R.id.viewMateriPenyebab24)
        viewMateriPenyebab25 = findViewById(R.id.viewMateriPenyebab25)
        viewMateriPenyebab26 = findViewById(R.id.viewMateriPenyebab26)
        viewMateriPenyebab27 = findViewById(R.id.viewMateriPenyebab27)
        viewMateriPenyebab28 = findViewById(R.id.viewMateriPenyebab28)
        viewMateriPenyebab29 = findViewById(R.id.viewMateriPenyebab29)
        viewMateriPenyebab30 = findViewById(R.id.viewMateriPenyebab30)

        if(intent.getStringExtra("materi") == "Penyebab") {
            viewMateriPenyebab1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab4 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab5 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab6.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab6 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab7.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab7 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab8.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab8 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab9.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab9 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab10.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab10 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab11.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab11 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab12.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab12 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab13.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab13 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab14.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab14 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab15.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab15 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab16.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab16 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab17.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab17 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab18.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab18 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab19.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab19 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab20.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab20 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab21.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab21 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab22.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab22 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab23.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab23 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab24.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab24 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab25.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab25 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab26.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab26 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab27.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab27 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab28.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab28 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab29.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPenyebab29 + "</b></p>", "text/html", "UTF-8")
            viewMateriPenyebab30.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPenyebab30 + "</b></p>", "text/html", "UTF-8")
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}