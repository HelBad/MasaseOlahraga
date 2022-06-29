package com.example.masaseolahraga.view.teknik

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.masaseolahraga.R

class ActivityVideo : AppCompatActivity() {
    lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        videoView = findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        if(intent.getStringExtra("judul") == "teknik1") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.coolingdown_kaki}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik2") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.coolingdown_pinggang}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik3") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.coolingdown_tangan}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik4") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.gastrock}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik5") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.hamstring}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik6") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.kepala}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik7") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.lengan_tangan}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik8") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.pantat}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik9") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.perut_dada}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik10") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.pinggang_punggung}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik11") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.pundak}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik12") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.punggung_kaki}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik13") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.quardricep}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik14") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.telapak_kaki}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik15") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.telapak_tangan}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "teknik16") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.tibialis_kaki}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityTeknik::class.java)
        startActivity(intent)
        finish()
    }
}