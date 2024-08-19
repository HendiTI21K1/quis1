package com.hendi.quizmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityJawaban5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawaban5)

        findViewById<ImageView>(R.id.kembaliMenuAwal5).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val textView1 = findViewById<TextView>(R.id.jawabanA5)
        val textView2 = findViewById<TextView>(R.id.jawabanA55)

        textView1.text = "5. Menurut anda, apa saja yang perlu diperhatikan oleh seorang desainer saat ingin merancang desain aplikasi mobile ?"
        textView2.text = " - Pengalaman Pengguna (UX): Desain harus mudah digunakan dan intuitif.\n" +
                " - Antarmuka Pengguna (UI): Konsistensi visual dan responsif di berbagai ukuran layar.\n" +
                " - Aksesibilitas: Desain harus dapat diakses oleh semua pengguna, termasuk mereka yang memiliki keterbatasan.\n" +
                " - Performansi: Aplikasi harus cepat dan efisien dalam memuat konten.\n" +
                " - Kesesuaian Platform: Ikuti pedoman desain masing-masing platform, seperti iOS dan Android.\n" +
                " - Fungsionalitas: Pastikan desain mendukung semua fitur aplikasi dengan baik.\n" +
                " - Uji Coba dan Umpan Balik: Uji desain dengan pengguna nyata dan lakukan perbaikan berdasarkan umpan balik."
    }
}