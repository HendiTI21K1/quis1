package com.hendi.quizmobileprogramming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.hendi.quizmobileprogramming.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jawaban1 = findViewById<TextView>(R.id.jawaban1)
        val jawaban2 = findViewById<TextView>(R.id.jawaban2)
        val jawaban3 = findViewById<TextView>(R.id.jawaban3)
        val jawaban4 = findViewById<TextView>(R.id.jawaban4)
        val jawaban5 = findViewById<TextView>(R.id.jawaban5)


        jawaban1.setOnClickListener {
            val intent = Intent(this, ActivityJawaban1::class.java)
            startActivity(intent)
        }

        jawaban2.setOnClickListener {
            val intent = Intent(this, ActivityJawaban2::class.java)
            startActivity(intent)
        }

        jawaban3.setOnClickListener {
            val intent = Intent(this, ActivityJawaban3::class.java)
            startActivity(intent)
        }

        jawaban4.setOnClickListener {
            val intent = Intent(this, ActivityJawaban4::class.java)
            startActivity(intent)
        }

        jawaban5.setOnClickListener {
            val intent = Intent(this, ActivityJawaban5::class.java)
            startActivity(intent)
        }
    }
}