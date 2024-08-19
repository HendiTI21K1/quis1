package com.hendi.quizmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityJawaban4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawaban4)

        findViewById<ImageView>(R.id.kembaliMenuAwal4).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val textView1 = findViewById<TextView>(R.id.jawabanA4)
        val textView2 = findViewById<TextView>(R.id.jawabanA44)

        textView1.text = "4. Apa yang dimaksud dengan activity dan intent pada android ?"
        textView2.text = "      Activity adalah Komponen yang mewakili layar tunggal dalam aplikasi Android, di mana pengguna dapat berinteraksi dengan aplikasi. sedangkan \n" +
                "       Intent adalah Objek yang digunakan untuk mengirimkan data dan berkomunikasi antar komponen aplikasi"
    }
}