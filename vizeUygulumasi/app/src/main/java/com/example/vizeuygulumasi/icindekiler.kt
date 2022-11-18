package com.example.vizeuygulumasi


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class icindekiler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icindekiler)

        val baslik = findViewById<TextView>(R.id.textView4)
        var seek1 = findViewById<SeekBar>(R.id.seekBar)
        var seek2 = findViewById<SeekBar>(R.id.seekBar2)
        val siparis = findViewById<Button>(R.id.button6)
        val tus1 = findViewById<Switch>(R.id.switch1)
        val tus2 = findViewById<Switch>(R.id.switch2)
        val tus3 = findViewById<Switch>(R.id.switch3)
        val tus4 = findViewById<Switch>(R.id.switch4)
        val tus5 = findViewById<Switch>(R.id.switch5)
        val tus6 = findViewById<Switch>(R.id.switch6)
        val time = findViewById<ProgressBar>(R.id.progressBar2)


        val isim = intent.getStringExtra("Ezogelin Çorbası")
        baslik.text = isim
        val isim2 = intent.getStringExtra("Düğün Çorbası")
        baslik.text = isim2
        val isim3 = intent.getStringExtra("Mercimek Çorbası")
        baslik.text = isim3
        val isim4 = intent.getStringExtra("Brokoli Çorbası")
        baslik.text = isim4
        val isim5 = intent.getStringExtra("Kelle Paça")
        baslik.text = isim5
        val isim6 = intent.getStringExtra("Yayla Çorbası")
        baslik.text = isim6
        val isim7 = intent.getStringExtra("Şehriye Çorbası")
        baslik.text = isim7
        val isim8 = intent.getStringExtra("Domates Çorbası")
        baslik.text = isim8
        val isim9 = intent.getStringExtra("Tarhana Çorbası")
        baslik.text = isim9
        val isim10 = intent.getStringExtra("Mantar Çorbası")
        baslik.text = isim10
        val isim11 = intent.getStringExtra("İşkembe Çorbası")
        baslik.text = isim11
        val isim12 = intent.getStringExtra("Tavuk Çorbası")
        baslik.text = isim12

        var tusdurum = tus1.isChecked
        var tusdurum2 = tus2.isChecked
        var tusdurum3 = tus3.isChecked
        var tusdurum4 = tus4.isChecked
        var tusdurum5 = tus5.isChecked
        var tusdurum6 = tus6.isChecked




        tus1.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Nane Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Nane Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }

        tus2.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Kekik Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kekik Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }

        tus3.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Limon Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Limon Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }

        tus4.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Yağ Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Yağ Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }

        tus5.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Toz Biber Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Toz Biber Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }
        tus6.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(applicationContext, "Kaşar Eklendi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kaşar Çıkarıldı", Toast.LENGTH_SHORT).show()
            }
        }



        seek1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                val uyari3 = AlertDialog.Builder(applicationContext)
                uyari3.setTitle("Uyarı!!!")
                uyari3.setMessage("Devam Etmek İstediğinize Emin misiniz?")
                uyari3.setIcon(R.drawable.b)
                uyari3.setCancelable(false)

                uyari3.setPositiveButton("EVET") { DialogInterface, i ->

                }

                uyari3.setNegativeButton("Hayır") { DialogInterface, i ->

                }
                uyari3.setNeutralButton("Yoksay") { DialogInterface, i ->

                }
                uyari3.create().show()

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Seekbar Tutuldu", Toast.LENGTH_SHORT).show()


            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Seekbar Bırakıldı", Toast.LENGTH_SHORT).show()

            }

        })
        seek2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Seekbar Tutuldu", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(applicationContext, "Seekbar Bırakıldı", Toast.LENGTH_SHORT).show()
            }

        })




        siparis.setOnClickListener {
            val uyari2 = AlertDialog.Builder(this)
            uyari2.setTitle("Sipariş Durumu")
            uyari2.setMessage("Siparişiniz Hazırlanıcak.Devam Etmek İstiyor musunuz")
            uyari2.setIcon(R.drawable.b)

            uyari2.setPositiveButton("EVET") { DialogInterface, i ->
                time.visibility = View.VISIBLE
                if (tusdurum == true || tusdurum2 == true || tusdurum3 == true || tusdurum4 == true || tusdurum5 == true || tusdurum6 == true) {
                    var sonSayfagecis = Intent(applicationContext, sonSayfa::class.java)
                    sonSayfagecis.putExtra("Nane Eklendi", tusdurum)
                    sonSayfagecis.putExtra("Kekik Eklendi", tusdurum2)
                    sonSayfagecis.putExtra("Limon Eklendi", tusdurum3)
                    sonSayfagecis.putExtra("Yağ Eklendi", tusdurum4)
                    sonSayfagecis.putExtra("Toz Biber Eklendi", tusdurum5)
                    sonSayfagecis.putExtra("Kaşar Eklendi", tusdurum6)
                }


                uyari2.setNegativeButton("Hayır") { DialogInterface, i ->

                }
                uyari2.setNeutralButton("Yoksay") { DialogInterface, i ->

                }
                uyari2.create().show()
            }
        }

    }
}