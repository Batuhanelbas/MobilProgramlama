package com.example.vizeuygulumasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class sonSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_son_sayfa)

        val text1 = findViewById<TextView>(R.id.textView9)
        val text2 = findViewById<TextView>(R.id.textView10)
        val text3 = findViewById<TextView>(R.id.textView11)
        val cikis = findViewById<Button>(R.id.button7)


        var alinansey = intent.getStringExtra("yazi")
        text3.text = "Güzel Seçim"

        var durum = intent.getStringExtra("Nane Eklendi")
        text2.text = "Nane Eklendi"
        var durum2 = intent.getStringExtra("Kekik Eklendi")
        text2.text = "Kekik Eklendi"
        var durum3 = intent.getStringExtra("Limon Eklendi")
        text2.text = "Limon Eklendi"
        var durum4 = intent.getStringExtra("Yağ Eklendi")
        text2.text = "Yağ Eklendi"
        var durum5 = intent.getStringExtra("Toz Biber Eklendi")
        text2.text = "Toz Biber Eklendi"
        var durum6 = intent.getStringExtra("Kaşar Eklendi")
        text2.text = "KaşarEklendi"




        cikis.setOnClickListener {
            val uyari = AlertDialog.Builder(this)
            uyari.setTitle("Uyarı!!!")
            uyari.setMessage("Çıkmak İstediğinize Emin misiniz ?")
            uyari.setIcon(R.drawable.b)

            uyari.setPositiveButton("EVET") { DialogInterface, i ->
                System.exit(0)
            }

            uyari.setNegativeButton("Hayır") { DialogInterface, i ->

            }
            uyari.setNeutralButton("Yoksay") { DialogInterface, i ->

            }
            uyari.create().show()
        }
    }
}