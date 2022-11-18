package com.example.vizeuygulumasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class gecisSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gecis_sayfasi)

        //tanımlar
        val sayac = findViewById<TextView>(R.id.textView)

        object : CountDownTimer(2000, 1000) {
            override fun onTick(p0: Long) {
                sayac.text = (p0 / 1000).toString()
            }

            override fun onFinish() {
                val gecisSayfasi = Intent(applicationContext, MainActivity::class.java)
                startActivity(gecisSayfasi)
                finish()
            }

        }.start()
    }
}