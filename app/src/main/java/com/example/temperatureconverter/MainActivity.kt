package com.example.temperatureconverter

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Mp:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Mp=MediaPlayer()
        var mp3file =assets.openFd("music.mp3")
        Mp.setDataSource(mp3file.fileDescriptor,mp3file.startOffset,mp3file.length)
        Mp.prepare()
        Mp.start()
        var stopMu=findViewById<Button>(R.id.button9)
        var welcomeText = findViewById<TextView>(R.id.textView2)
        var BtnEnd = findViewById<Button>(R.id.button2)

        stopMu.setOnClickListener {
            Mp.stop()
        }
        welcomeText.setOnClickListener {
            var activity2Intent = Intent(this, Activity2::class.java)
            startActivity(activity2Intent)
        }
        BtnEnd.setOnClickListener {
            Mp.stop()
            finish()

        }
    }
}