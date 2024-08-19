package com.hendi.quizmobileprogramming

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ActivityJawaban3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jawaban3)

        findViewById<ImageView>(R.id.kembaliMenuAwal3).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val textView1 = findViewById<TextView>(R.id.jawabanA3)
        val textView2 = findViewById<TextView>(R.id.jawabanA33)

        textView1.text = "3. Jelaskan pendapat anda mengenai perbedaan antara satuan unit dp dan juga sp pada android ?"
        textView2.text = "• dp (Density-Independent Pixels): Digunakan untuk ukuran elemen UI seperti tombol dan margin. Ini memastikan elemen tampak konsisten di berbagai perangkat dengan kepadatan layar yang berbeda dan menjaga ukuran elemen UI konsisten di berbagai kepadatan layar.\n" +
                "\n" +
                "• sp (Scale-Independent Pixels): Digunakan khusus untuk ukuran teks. Ini juga memperhitungkan preferensi ukuran teks pengguna, sehingga teks dapat disesuaikan dengan pengaturan aksesibilitas di perangkat mereka serta menyesuaikan ukuran teks dengan preferensi pengguna untuk aksesibilitas."
    }
}