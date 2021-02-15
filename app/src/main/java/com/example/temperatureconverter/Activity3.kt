package com.example.temperatureconverter

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.NullPointerException
import java.nio.charset.Charset

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        var BtnCF = findViewById<Button>(R.id.button3)
        var BtnCK = findViewById<Button>(R.id.button4)
        var BtnFC = findViewById<Button>(R.id.button5)
        var BtnFK = findViewById<Button>(R.id.button6)
        var BtnKC = findViewById<Button>(R.id.button7)
        var BtnKF = findViewById<Button>(R.id.button8)
        var IntentData = Intent()
        BtnCF.setOnClickListener {
            IntentData.putExtra("data", "CF")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }
        BtnCK.setOnClickListener {
            IntentData.putExtra("data", "CK")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }
        BtnFC.setOnClickListener {
            IntentData.putExtra("data", "FC")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }
        BtnFK.setOnClickListener {
            IntentData.putExtra("data", "FK")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }
        BtnKC.setOnClickListener {
            IntentData.putExtra("data", "KC")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }
        BtnKF.setOnClickListener {
            IntentData.putExtra("data", "KF")
            setResult(Activity.RESULT_OK, IntentData)
            finish()
        }

    }
}