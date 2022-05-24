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
        if(intent.getStringExtra("judul") == "kepala") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.tes_1}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        } else if(intent.getStringExtra("judul") == "leher") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.tes_2}")
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