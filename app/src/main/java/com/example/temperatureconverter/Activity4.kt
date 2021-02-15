package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        var textans=findViewById<TextView>(R.id.textView14)
        var dataIntent=this.intent
        textans.text=dataIntent.getDoubleExtra("answer",-1.0).toString()
    }
}