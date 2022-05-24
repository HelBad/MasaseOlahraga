package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.LinearLayout
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityPertolongan : AppCompatActivity() {
    lateinit var layoutMateriPertolongan2: LinearLayout
    lateinit var layoutMateriPertolongan3: LinearLayout
    lateinit var layoutMateriPertolongan4: LinearLayout
    lateinit var layoutMateriPertolongan5: LinearLayout
    lateinit var layoutMateriPertolongan6: LinearLayout
    lateinit var layoutMateriPertolongan7: LinearLayout
    lateinit var layoutMateriPertolongan8: LinearLayout
    lateinit var layoutMateriPertolongan9: LinearLayout
    lateinit var viewMateriPertolongan1: WebView
    lateinit var viewMateriPertolongan2: WebView
    lateinit var viewMateriPertolongan3: WebView
    lateinit var viewMateriPertolongan4: WebView
    lateinit var viewMateriPertolongan5: WebView
    lateinit var viewMateriPertolongan6: WebView
    lateinit var viewMateriPertolongan7: WebView
    lateinit var viewMateriPertolongan8: WebView
    lateinit var viewMateriPertolongan9: WebView

    val textPertolonganKulit1 = "Luka adalah kerusakan struktur atau fungsi tubuh karena paksaaan " +
            "atau tekanan fisik mupun kimiawi. Luka yang sering terjadi adalah luka lecet " +
            "(ekskoriasi), robek (laserasi), luka tusuk (punctrum) terpotong maupun terpisahnya " +
            "kulit. Pertolongan Pertamananya sebagai berikut :"
    val textPertolonganKulit2 = "Bersihkan luka dengan hydrogen peroksida (H202) 3%, detol atau " +
            "betadin atau sabun."
    val textPertolonganKulit3 = "Keringkan Luka lalu berikan obat yang menandung antiseptik " +
            "seperti : obat merah, yodium tingtur, dan larutan betadin pekat."
    val textPertolonganKulit4 = "Jika perlu balut luka dengan kain kasa steril agar darah tidak " +
            "terlalu banyak keluar."
    val textPertolonganKulit5 = "Beri kompres diatasanya."
    val textPertolonganKulit6 = "Tinggikan bagian yang luka, lebih tinggi dari letak jantung."
    val textPertolonganKulit7 = "Pada luka terbuka atau tusuk, harus diberi suntikan Anti Tetanus " +
            "serum dan apabila robek lebih dari 1 cm harus dijahit."
    val textPertolonganOtot1 = "Strain adalah adalah cedera yang terjadi karena regangan berlebihan " +
            "atau terjadi robekan pada otot maupun tendon karena penggunaan yang berlebihan. Sprain " +
            "adalah cedera yang terjadi karena regangan berlebihan atau terjadi robekan pada " +
            "ligamen dan kapsul sendi. Tingkatan Strain, Sprain, dan Pertolongan Pertamannya."
    val textPertolonganOtot2 = "Strain atau Sprain Derajat I (First Degree Strain or Sprain). " +
            "Cedera yang paling ringan disertai sedikit pembengkakan atau rasa nyeri, dimana cedera " +
            "yang terjadi hanya mengenai beberapa serabut otot, tendon, atau ligament yang robek " +
            "dan tidak memerlukan pengobatan. Tidak perlu penanganan khusus, cukup istirahat saja " +
            "karena akan sembuh sendiri."
    val textPertolonganOtot3 = "Strain atau Sprain Derajat II (Second Degree Strain or Sprain). " +
            "Cedera yang terjadi robeknya sebagian besar serabut otot, tendon, atau ligament dapat " +
            "sampai setengah jumlahnya yang robek. Penanganannya dengan melakukan metode RICE, " +
            "disamping itu harus melakukan istirahat yang lebih sempurna dengan tindakan " +
            "immobilisasi dengan cara membalut dan lain-lain. Waktu istrahat diperkirakan 3-6 minggu."
    val textPertolonganOtot4 = "Strain atau Sprain Derajat III (Third Degree Strain or Sprain). " +
            "Cedera yang terjadi robeknya atau putusnya lebih dari setengan serabut otot, tendon, " +
            "atau ligament bahkan bisa robek atau putus total. Penangannanya dengan menggunakan " +
            "metode RICE sesuai urutan lalu dikirim ke rumah sakit untuk mendapatkan penanganan " +
            "lebih lanjut dari ahli medis."
    val textPertolonganTulang1 = "Patah Tulang merupakan terputusnya tulang pada tubuh, ada dua " +
            "jenis patah tulang dalam tubuh (fraktur) sebagai berikut : Patah tulang tertutup bila " +
            "ujung tulang yang patah tidak menembus ke luar kulit, serta Patah tulang terbuka bila " +
            "ada luka pada kulit yang berhubungan dengan fraktur atau bisa juga ujung-ujung tulang " +
            "menembus kulit. Penyebab Fraktur sebagai berikut : 1) Kekerasan langsung, karena " +
            "pukulan atau tendangan yang sifatnya ekstrim. 2) Kekerasan tidak langsung, jatuh dalam " +
            "posisi tidak benar. 3) Gerakan yang dilakukan tiba-tiba kontraksinya. 4) Karena " +
            "kelelahan pada tulang, misalnya pada pelari jarak jauh (maraton), hal ini sering " +
            "menyebabkan retaknya bagian distal dari tulang fibula dan tulang metatarsal kedua. " +
            "Gejala-gejala patah tulang : adanya reaksi radang setempat yang hebat, terjadinya " +
            "fungsiolesa, nyeri pada lokasi patah tulang, adanya perubahan bentuk tulang, serta " +
            "adanya bunyi tulang karena gesekan ujung tulang yang satu dengan ujung tulang yang " +
            "lainnya yang dapat dirasakan penderita. Adapun pertolongan pertama pada patah tulang " +
            "sebagai berikut :"
    val textPertolonganTulang2 = "Penderita tidak boleh melanjutkan aktivitas atau kegiatan lagi."
    val textPertolonganTulang3 = "Pertolongan pertama dilakukan reposisi oleh ahli medis secepat " +
            "mungkin dalam waktu 15 menit, karena pada saat itu penderita tidak merasakan nyeri " +
            "bila dilakukan reposisi."
    val textPertolonganTulang4 = "Kemudian dipasangkan spalk dan balut tekan untuk mempertahankan " +
            "kedudukan tulang yang baru, serta menghentikan pendarahan. Jika tidak ada dokter, " +
            "petugas P3K tidak boleh melakukan reposisi. Hanya boleh melakukan metode RICE saja " +
            "serta memasang spalk atau bidai. Tujuannya agar patah tulang yang patah tidak merobek " +
            "jaringan di sekitarnya. Kalau ada luka terbuka di area patah tulang yang merobek kulit, " +
            "luka tersebut ditutup dengan kain kasa steril dipasang spalk atau bidai setelah itu " +
            "lakukan metode RICE dan kirim ke rumah sakit terdekat."
    val textPertolonganSendi1 = "Sendi adalah hubungan antara 2 buah ujung tulang yang berfungsi " +
            "seperti 2 buah engsel sehingga tulang yang satu dapat bergerak terhadap tulang yang " +
            "lainnya. Ujung tulang yang tidak terlindung secara berangsur-angsur dapat menjadi haus " +
            "karena pergesekan dengan tulang rawan yang berhadapan. Cedera yang mungkin terjadi " +
            "pada sendi adalah cedera pada kapsula artikularis atau simpai sendi. Kapsula " +
            "artikularis terdiri dari lapisan luar startum fibrosum dan lapisan dalam startum " +
            "sinovialis yang menghasilkan sendi yang disebut synovia. Bila sendi atau lutut terkena " +
            "pukulan dan melukai simpati sendi, maka akan menimbulkan keadaan synovitis. Akibatnya " +
            "akan menimbulkan produksi cairan yang berlebih sehingga menimbulkan pembengkakan pada " +
            "lutut yang disebut hidrops. Bila cedera lutut merobek simpai sendi sehingga menyebabkan " +
            "pendarahan (cairan bercampur darah) disebut haemarthros. Adapaun pertolongan pertama " +
            "pada cedera sendi sebagai berikut :"
    val textPertolonganSendi2 = "Bila terjadi traumatic synovitis, terapkan metode RICE. Kalau " +
            "cederanya ringan maka cukup dengan metode RICE saja dapat diatasi."
    val textPertolonganSendi3 = "Diberikan tahapan-tahapan yang teratur."
    val textPertolonganSendi4 = "Jika pertolongan RICE teryata tidak mengurangi pembengkakan, maka " +
            "sebaiknya dikonsultasikan kepada dokter atau dokter ahli bedah tulang."
    val textPertolonganFibrositis1 = "Fibrositis adalah istilah yang secara luas digunakan untuk " +
            "menggambarkan daerah yang sakit yaitu jaringan lunak misalnya otot atau tendon, fasia " +
            "yang menutupinya, serta jaringan dibawah kulit. Misalnya orang yang sering mengatakan " +
            "salah bantal atau sakit untuk menoleh. Gerakan sendi yang terganggu biasanya terjadi " +
            "pada daerah tengkuk, daerah diantara kedua scapula, serta pinggang. Penyebab secara " +
            "pasti belum jelas, tetapi dapat diperkirakan sebagai berikut :"
    val textPertolonganFibrositis2 = "Terkena angin yang terus menerus dari satu arah."
    val textPertolonganFibrositis3 = "Terkena udara dingin dan lembab dalam waktu yang relatif lama."
    val textPertolonganFibrositis4 = "Otot atau tendon terlalu lelah."
    val textPertolonganFibrositis5 = "Memiliki masalah yang terlalu berat."
    val textPertolonganFibrositis6 = "Adanya local infeksi atau masuknya kuman-kuman penyakit " +
            "melalui lubang-lubang yang tidak terduga, misalnya gigi yang berlubang. Pertolongan " +
            "pertamanya adalah RICE, dan masase."
    val textPertolonganKuntosio1 = "Memar (kuntosio) adalah cedera yang disebabkan akibat benturan " +
            "maupun pukulan langsung pada kulit, otot atau tendon sehingga menimbulkan warna " +
            "kebiru-biruan atau kehitaman. Warna kebiruan terjadi karena penguraian bekuan-bekuan " +
            "darah terutama hemoglobin, sehingga menimbulkan warna kebiru-biruan (hemosiderin). " +
            "Pada memar, jaringan dibawah permukaan kulit rusak dan pembuluh darah kecil pecah " +
            "sehingga darah dan cairan seluler merembes ke jaringan sekitarnya. Hematoma adalah " +
            "kumpulan darah diluar pembuluh darah pada jaringan dibawah kulit ataupun di antara " +
            "jaringan kulit. Kadang-kadang hematoma yang mengalami pembengkakan jauh dari tempat " +
            "cedera. Hal ini disebabkan karena cairan plasma darah itu mengalir ke tempat yang " +
            "lebih rendah dan berkumpul disana. Pertolongan pertama dapat dilakukan dengan metode " +
            "RICE, fisioterapi treatment, dan obat-obatan nyeri."
    val textPertolonganKram1 = "Kram adalah kontraksi yang terus menerus dan berlebihan dari otot " +
            "atau sekelompok otot yang terjadi secara mendadak dan tanpa disadari. Beberapa " +
            "penyebab kram sebagai berikut :"
    val textPertolonganKram2 = "Pada saat otot-otot mengalami kelelahan dan secara tiba-tiba " +
            "meregang, maka otot tersebut dengan terpaksa akan merangsang secara penuh."
    val textPertolonganKram3 = "Ketidaksempurnaan biomekanika tubuh karena adanya ketidaksejajaran " +
            "dari bagian bawah kaki."
    val textPertolonganKram4 = "Kekurangan beberapa jenis mineral tertentu seperti sodium, " +
            "potassium, kalium, dan zat besi."
    val textPertolonganKram5 = "Terbatasnya suplai darah yang tersedia pada otot yang dipergunakan. " +
            "Pertolongan pertama yang harus dilakukan."
    val textPertolonganKram6 = "Penderita dibawa ke pinggir lapangan atau area yang tidak sempit."
    val textPertolonganKram7 = "Kontraksikan otot yang berlawanan."
    val textPertolonganKram8 = "Lakukan peregangan secara bertahap dari otot yang terkena sampai " +
            "mencapai panjangnya yang normal, misalnya betis hal ini tercapai bila pergelangan " +
            "kaki dorsofleksi 90 derajat dengan otot lurus. Jangan sentakan kaki ke atas karena hal " +
            "ini dapat menimbulkan cedera yang lebih parah pada otot yang terkena."
    val textPertolonganKram9 = "Lakukan gerakan masase."
    val textPertolonganDislokasi1 = "Dislokasi adalah perpindahan permukaan tulang-tulang yang " +
            "membentuk sendi sehingga tulang-tulang tersebut tidak berhadapan lagi. Tanda–tanda " +
            "terjadinya dislokasi :"
    val textPertolonganDislokasi2 = "Terjadinya perubahan bentuk (deformitas) pada sendi yang " +
            "mengalami dislokasi."
    val textPertolonganDislokasi3 = "Nyeri yang hebat bila melakukan gerakan sendi yang normal " +
            "pertolongan pertamanya."
    val textPertolonganDislokasi4 = "Setelah reposisi, metode RICE dipakai sambal dilakukan " +
            "immobilisasi (suatu tindakan yang dilakaukan supaya bagian yang cedera tidak bisa " +
            "digerakan lagi misalnya dengan memakai bidai, spalk, atau gips)."
    val textPertolonganDislokasi5 = "Bila pada waktu dislokasi disertai dengan putusnya ligamen " +
            "secara sempurna, ini harus dikirim ke rumah sakit."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_pertolongan)

        layoutMateriPertolongan2 = findViewById(R.id.layoutMateriPertolongan2)
        layoutMateriPertolongan3 = findViewById(R.id.layoutMateriPertolongan3)
        layoutMateriPertolongan4 = findViewById(R.id.layoutMateriPertolongan4)
        layoutMateriPertolongan5 = findViewById(R.id.layoutMateriPertolongan5)
        layoutMateriPertolongan6 = findViewById(R.id.layoutMateriPertolongan6)
        layoutMateriPertolongan7 = findViewById(R.id.layoutMateriPertolongan7)
        layoutMateriPertolongan8 = findViewById(R.id.layoutMateriPertolongan8)
        layoutMateriPertolongan9 = findViewById(R.id.layoutMateriPertolongan9)
        viewMateriPertolongan1 = findViewById(R.id.viewMateriPertolongan1)
        viewMateriPertolongan2 = findViewById(R.id.viewMateriPertolongan2)
        viewMateriPertolongan3 = findViewById(R.id.viewMateriPertolongan3)
        viewMateriPertolongan4 = findViewById(R.id.viewMateriPertolongan4)
        viewMateriPertolongan5 = findViewById(R.id.viewMateriPertolongan5)
        viewMateriPertolongan6 = findViewById(R.id.viewMateriPertolongan6)
        viewMateriPertolongan7 = findViewById(R.id.viewMateriPertolongan7)
        viewMateriPertolongan8 = findViewById(R.id.viewMateriPertolongan8)
        viewMateriPertolongan9 = findViewById(R.id.viewMateriPertolongan9)

        if(intent.getStringExtra("materi") == "Pada Kulit") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganKulit1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit4 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit5 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan6.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit6 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan7.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKulit7 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Pada Otot") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganOtot1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganOtot2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganOtot3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganOtot4 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan5.visibility = View.GONE
            layoutMateriPertolongan6.visibility = View.GONE
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Patah Tulang") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganTulang1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganTulang2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganTulang3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganTulang4 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan5.visibility = View.GONE
            layoutMateriPertolongan6.visibility = View.GONE
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Pada Sendi") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganSendi1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganSendi2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganSendi3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganSendi4 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan5.visibility = View.GONE
            layoutMateriPertolongan6.visibility = View.GONE
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Fibrositis") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganFibrositis1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganFibrositis2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganFibrositis3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganFibrositis4 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganFibrositis5 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan6.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganFibrositis6 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Kuntosio") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganKuntosio1 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan2.visibility = View.GONE
            layoutMateriPertolongan3.visibility = View.GONE
            layoutMateriPertolongan4.visibility = View.GONE
            layoutMateriPertolongan5.visibility = View.GONE
            layoutMateriPertolongan6.visibility = View.GONE
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        } else if(intent.getStringExtra("materi") == "Kram Otot") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganKram1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram4 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram5 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan6.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram6 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan7.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram7 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan8.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram8 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan9.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganKram9 + "</b></p>", "text/html", "UTF-8")
        } else if(intent.getStringExtra("materi") == "Dislokasi") {
            viewMateriPertolongan1.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b> &emsp; &nbsp;" +
                    textPertolonganDislokasi1 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan2.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganDislokasi2 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan3.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganDislokasi3 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan4.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganDislokasi4 + "</b></p>", "text/html", "UTF-8")
            viewMateriPertolongan5.loadData("<p style=\"text-align: justify; font-size: 15px; color: DimGray;\"><b>" +
                    textPertolonganDislokasi5 + "</b></p>", "text/html", "UTF-8")
            layoutMateriPertolongan6.visibility = View.GONE
            layoutMateriPertolongan7.visibility = View.GONE
            layoutMateriPertolongan8.visibility = View.GONE
            layoutMateriPertolongan9.visibility = View.GONE
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}