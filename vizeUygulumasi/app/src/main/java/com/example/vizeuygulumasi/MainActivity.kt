package com.example.vizeuygulumasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tanımlar
        val b: Button = findViewById(R.id.button)
        val a: Button = findViewById(R.id.button2)
        val t: Button = findViewById(R.id.button3)
        val u: Button = findViewById(R.id.button4)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val image4 = findViewById<ImageView>(R.id.imageView4)
        val image5 = findViewById<ImageView>(R.id.imageView5)
        val image6 = findViewById<ImageView>(R.id.imageView6)
        val temp1 = findViewById<ProgressBar>(R.id.progressBar3)


        b.setOnClickListener {
            image3.visibility = View.VISIBLE

            a.setOnClickListener {
                image4.visibility = View.VISIBLE
                t.setOnClickListener {
                    image5.visibility = View.VISIBLE
                    u.setOnClickListener {
                        image6.visibility = View.VISIBLE

                        object : CountDownTimer(5000, 1000) {
                            override fun onTick(p0: Long) {
                                temp1.visibility = View.VISIBLE
                                if (p0 < 2000) {
                                    Toast.makeText(
                                        applicationContext,
                                        "Çorba Menüsüne Yönlendiriliyorsunuz",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }

                            override fun onFinish() {
                                val filmSecimi = Intent(applicationContext, corbaMenusu::class.java)
                                startActivity(filmSecimi)
                                finish()
                            }

                        }.start()
                    }
                }
            }
        }
    }
}