package com.hendi.quizmobileprogramming

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityJawaban1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawaban1)

        findViewById<ImageView>(R.id.kembaliMenuAwal1).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val textView1 = findViewById<TextView>(R.id.jawabanA1)
        val textView2 = findViewById<TextView>(R.id.jawabanA11)

        textView1.text = "1. Jelaskan perkembangan Android dari masa ke masa !"
        textView2.text = "Android pertama kali diluncurkan pada tahun 2008 dengan versi 1.0 yang menawarkan integrasi dengan layanan Google seperti Gmail dan Google Maps. Pada tahun 2009, Android 1.5 Cupcake memperkenalkan keyboard virtual, widget pihak ketiga, dan perekaman video. Versi berikutnya, Android 1.6 Donut, mendukung resolusi layar yang lebih tinggi dan integrasi pencarian yang lebih baik. Pada akhir 2009, Android 2.0/2.1 Eclair membawa fitur navigasi Google Maps, dukungan HTML5, dan pinch-to-zoom.\n" +
                "\n" +
                "Pada tahun 2010, Android 2.2 Froyo meningkatkan kecepatan sistem, mendukung Adobe Flash, dan memperkenalkan fitur Wi-Fi hotspot. Kemudian, Android 2.3 Gingerbread yang dirilis pada akhir tahun 2010 memperbaiki desain antarmuka dan menambahkan dukungan NFC. Android 3.0 Honeycomb pada tahun 2011 dirancang khusus untuk tablet, menawarkan multitasking yang lebih baik. Android 4.0 Ice Cream Sandwich pada tahun yang sama menyatukan antarmuka ponsel dan tablet, serta memperkenalkan fitur face unlock.\n" +
                "\n" +
                "Selama periode 2012-2013, Android 4.1-4.3 Jelly Bean memperkenalkan Project Butter untuk kinerja yang lebih halus, Google Now, dan notifikasi yang diperluas. Android 4.4 KitKat pada tahun 2013 mengoptimalkan penggunaan RAM, memperkenalkan immersive mode, dan meningkatkan Google Now. Pada tahun 2014, Android 5.0 Lollipop membawa desain Material yang segar, dukungan untuk perangkat 64-bit, dan notifikasi yang lebih baik.\n" +
                "\n" +
                "Android 6.0 Marshmallow pada tahun 2015 memperkenalkan manajemen izin aplikasi yang lebih baik, Doze mode untuk penghematan baterai, dan dukungan sidik jari. Pada tahun 2016, Android 7.0 Nougat menambahkan fitur multi-window, notifikasi interaktif, dan mode VR. Android 8.0 Oreo pada tahun 2017 memperkenalkan mode picture-in-picture, notifikasi channel, dan peningkatan keamanan.\n" +
                "\n" +
                "Android 9.0 Pie yang dirilis pada tahun 2018 memperkenalkan navigasi gestur, Digital Wellbeing untuk kesehatan digital, dan dukungan AI yang lebih baik. Android 10 pada tahun 2019 membawa navigasi gestur yang lebih baik, mode gelap, dan peningkatan privasi. Android 11 pada tahun 2020 menambahkan kontrol percakapan yang lebih baik, perekam layar bawaan, dan peningkatan privasi.\n" +
                "\n" +
                "Pada tahun 2021, Android 12 memperkenalkan desain Material You, peningkatan performa, dan privasi yang lebih baik. Android 13 pada tahun 2022 fokus pada personalisasi, kontrol privasi yang lebih baik, dan optimasi kinerja. Terakhir, Android 14 yang dirilis pada tahun 2023 menekankan pada keamanan, performa, dan peningkatan pengalaman pengguna yang lebih baik. Perkembangan Android ini menunjukkan komitmen yang kuat terhadap inovasi dan adaptasi untuk memenuhi kebutuhan pengguna di seluruh dunia."

        val button = findViewById<Button>(R.id.buttonOpenLink)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Android_version_history"))
            startActivity(intent)
        }
    }
}