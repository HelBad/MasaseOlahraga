package com.example.masaseolahraga.view

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.viewpager.widget.ViewPager
import com.example.masaseolahraga.R
import com.example.masaseolahraga.adapter.ViewpagerImgslider
import com.example.masaseolahraga.view.cedera.ActivityCedera
import com.example.masaseolahraga.view.lainnya.ActivityOtot
import com.example.masaseolahraga.view.lainnya.ActivityProfil
import com.example.masaseolahraga.view.lainnya.ActivityPustaka
import com.example.masaseolahraga.view.teknik.ActivityTeknik
import com.example.masaseolahraga.view.lainnya.ActivityTulang
import java.util.*

class ActivityUtama : AppCompatActivity() {
    lateinit var alertDialog: AlertDialog.Builder
    lateinit var ototUtama: ImageView
    lateinit var tulangUtama: ImageView
    lateinit var teknikUtama: ImageView
    lateinit var cederaUtama: ImageView
    lateinit var profilUtama: ImageView
    lateinit var pustakaUtama: ImageView

    lateinit var viewpagerUtama : ViewPager
    var path : IntArray = intArrayOf(R.drawable.img_foto_1, R.drawable.img_foto_2,
        R.drawable.img_foto_3, R.drawable.img_foto_4)
    lateinit var adapter : ViewpagerImgslider
    var currentPage : Int = 0
    lateinit var timer : Timer
    val DELAY : Long = 3000
    val PERIOD : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)

        alertDialog = AlertDialog.Builder(this)
        ototUtama = findViewById(R.id.ototUtama)
        tulangUtama = findViewById(R.id.tulangUtama)
        teknikUtama = findViewById(R.id.teknikUtama)
        cederaUtama = findViewById(R.id.cederaUtama)
        profilUtama = findViewById(R.id.profilUtama)
        pustakaUtama = findViewById(R.id.pustakaUtama)
        viewpagerUtama = findViewById(R.id.viewpagerUtama)

        updatePage()
        ototUtama.setOnClickListener {
            val intent = Intent(this, ActivityOtot::class.java)
            startActivity(intent)
            finish()
        }
        tulangUtama.setOnClickListener {
            val intent = Intent(this, ActivityTulang::class.java)
            startActivity(intent)
            finish()
        }
        teknikUtama.setOnClickListener {
            val intent = Intent(this, ActivityTeknik::class.java)
            startActivity(intent)
            finish()
        }
        cederaUtama.setOnClickListener {
            val intent = Intent(this, ActivityCedera::class.java)
            startActivity(intent)
            finish()
        }
        profilUtama.setOnClickListener {
            val intent = Intent(this, ActivityProfil::class.java)
            startActivity(intent)
            finish()
        }
        pustakaUtama.setOnClickListener {
            val intent = Intent(this, ActivityPustaka::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun updatePage() {
        adapter = ViewpagerImgslider(this, path)
        viewpagerUtama.adapter = adapter
        var handler = Handler()
        val Update = Runnable {
            if(currentPage == path.size) {
                currentPage = 0
            }
            viewpagerUtama.setCurrentItem(currentPage++, true)
        }
        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, DELAY, PERIOD)
        viewpagerUtama.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageSelected(position: Int) {
                currentPage = position
            }
        })
    }

    override fun onBackPressed() {
        alertDialog.setTitle("Keluar Aplikasi")
        alertDialog.setMessage("Apakah anda ingin keluar aplikasi ?").setCancelable(false)
            .setPositiveButton("YA", object: DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, id:Int) {
                    finishAffinity()
                }
            })
            .setNegativeButton("TIDAK", object: DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, id:Int) {
                    dialog.cancel()
                }
            }).create().show()
    }
}