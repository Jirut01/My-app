package com.example.temperatureconverter

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.NullPointerException

class Activity2 : AppCompatActivity() {
    var finalresult: Double = 0.0
    lateinit var inputText: EditText
     var NoInput: String=""
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
                var select_unit = data!!.getStringExtra("data")
                try{when (select_unit) {
                    "CF" -> finalresult = inputText.text.toString().toInt() * 1.8 + 32.0
                    "CK" -> finalresult = inputText.text.toString().toInt() + 273.0
                    "FC" -> finalresult = (inputText.text.toString().toInt() - 32.0) / 1.8
                    "FK" -> finalresult = ((inputText.text.toString().toInt() - 32.0) * 0.5) + 273.0
                    "KC" -> finalresult = inputText.text.toString().toInt() - 273.0
                    "KF" -> finalresult = ((inputText.text.toString().toInt() - 273.0) * 0.5) + 32.0
                }
        }catch (e:NullPointerException) {
            NoInput = "No Input"
                    Log.v("answer", NoInput.toString())
                    var activity4Intent = Intent(this, Activity4::class.java)
                    activity4Intent.putExtra("answer", NoInput)
                    startActivity(activity4Intent)
        }
        }

     Log.v("answer", finalresult.toString())
    var activity4Intent = Intent(this, Activity4::class.java)
    activity4Intent.putExtra("answer", finalresult)
    startActivity(activity4Intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var BtnSelect=findViewById<Button>(R.id.button)
        var textcf=findViewById<TextView>(R.id.textView7)
        var textck=findViewById<TextView>(R.id.textView8)
        var textfc=findViewById<TextView>(R.id.textView9)
        var textfk=findViewById<TextView>(R.id.textView15)
        var textkc=findViewById<TextView>(R.id.textView16)
        var textkf=findViewById<TextView>(R.id.textView10)

        var textv=findViewById<EditText>(R.id.editTextTextMultiLine)
        inputText = findViewById(R.id.editTextNumberDecimal2)
        textcf.setOnClickListener {
            var file=resources.openRawResource(R.raw.problem)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
        textck.setOnClickListener {
            var file=resources.openRawResource(R.raw.problemck)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
        textfc.setOnClickListener {
            var file=resources.openRawResource(R.raw.problemfc)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
        textfk.setOnClickListener {
            var file=resources.openRawResource(R.raw.problemfk)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
        textkc.setOnClickListener {
            var file=resources.openRawResource(R.raw.problemkc)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
        textkf.setOnClickListener {
            var file=resources.openRawResource(R.raw.problemkf)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            textv.setText(text)
        }
     BtnSelect.setOnClickListener {
         var activity2Intent = Intent(this, Activity3::class.java)
         startActivityForResult(activity2Intent,1234)


     }
    }


}