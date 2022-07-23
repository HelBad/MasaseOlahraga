package com.example.masaseolahraga.view.cedera.materi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.masaseolahraga.R
import com.example.masaseolahraga.view.cedera.ActivityCedera

class ActivityStrain : AppCompatActivity() {
    lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strain)

        videoView = findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        if(intent.getStringExtra("materi") == "Strain") {
            val videoUri = Uri.parse("android.resource://$packageName/${R.raw.cedera_strain_angkle}")
            videoView.setMediaController(mediaController)
            videoView.setVideoURI(videoUri)
            videoView.requestFocus()
            videoView.start()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, ActivityCedera::class.java)
        startActivity(intent)
        finish()
    }
}