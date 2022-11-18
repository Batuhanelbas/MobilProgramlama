package com.example.vizeuygulumasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.View
import android.widget.*

class corbaMenusu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corba_menusu)

        val corba = findViewById<CheckBox>(R.id.checkBox)
        val grup = findViewById<RadioGroup>(R.id.radioGroup2)
        val ezogelin = findViewById<RadioButton>(R.id.radioButton)
        val dugun = findViewById<RadioButton>(R.id.radioButton2)
        val mercimek = findViewById<RadioButton>(R.id.radioButton3)
        val brokoli = findViewById<RadioButton>(R.id.radioButton4)
        val kellePaca = findViewById<RadioButton>(R.id.radioButton5)
        val yayla = findViewById<RadioButton>(R.id.radioButton6)
        val sehriye = findViewById<RadioButton>(R.id.radioButton7)
        val domates = findViewById<RadioButton>(R.id.radioButton8)
        val tarhana = findViewById<RadioButton>(R.id.radioButton9)
        val mantar = findViewById<RadioButton>(R.id.radioButton10)
        val iskembe = findViewById<RadioButton>(R.id.radioButton11)
        val tavuk = findViewById<RadioButton>(R.id.radioButton12)
        val devam = findViewById<Button>(R.id.button5)


        val isim = ezogelin.text.toString()
        val isim2 = dugun.text.toString()
        val isim3 = mercimek.text.toString()
        val isim4 = brokoli.text.toString()
        val isim5 = kellePaca.text.toString()
        val isim6 = yayla.text.toString()
        val isim7 = sehriye.text.toString()
        val isim8 = domates.text.toString()
        val isim9 = tarhana.text.toString()
        val isim10 = mantar.text.toString()
        val isim11 = iskembe.text.toString()
        val isim12 = tavuk.text.toString()


        val tasarim = layoutInflater.inflate(R.layout.toast_ozel, null)
        val toasttakiyazi = tasarim.findViewById<TextView>(R.id.textView3)
        val toastozel = Toast(applicationContext)


        corba.setOnClickListener {
            grup.visibility = View.VISIBLE
            devam.visibility = View.VISIBLE
        }





        ezogelin.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Ezogelin Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Ezogelin Çorbası", isim)
                            startActivity(icindekiler)
                        }

                    }.start()
                }
            }
        }
        dugun.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Düğün Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Düğün Çorbası", isim2)
                            startActivity(icindekiler)
                            finish()
                        }
                    }.start()
                }
            }
        }
        mercimek.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Mercimek Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Mercimek Çorbası", isim3)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        brokoli.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Brokoli Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Brokoli Çorbası", isim4)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        kellePaca.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Kelle Paça Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Kelle Paça", isim5)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        yayla.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Yayla Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Yayla Çorbası", isim6)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        sehriye.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Şehriye Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Şehriye Çorbası", isim7)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        domates.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Domates Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Domates Çorbası", isim8)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        tarhana.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Tarhana Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Tarhana Çorbası", isim9)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        mantar.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Mantar Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Mantar Çorbası", isim10)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        iskembe.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "İşkembe Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("İşkembe Çorbası", isim11)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
        tavuk.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                devam.setOnClickListener {
                    object : CountDownTimer(5000, 1000) {
                        override fun onTick(p0: Long) {
                            toasttakiyazi.text = "Tavuk Çorbası Güzel Seçim"
                            toastozel.view = tasarim
                            toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                            toastozel.duration = Toast.LENGTH_SHORT
                            toastozel.show()
                        }

                        override fun onFinish() {
                            val icindekiler = Intent(applicationContext, icindekiler::class.java)
                            icindekiler.putExtra("Tavuk Çorbası", isim12)
                            startActivity(icindekiler)
                            finish()
                        }

                    }.start()
                }
            }
        }
    }
}