package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tambah: Button = findViewById(R.id.btn_tambah)
        var kurang: Button = findViewById(R.id.btn_kurang)
        var reset: Button = findViewById(R.id.reset)
        var txt: TextView = findViewById(R.id.label)

        var num: Int = 0

        tambah.setOnClickListener{
            num += 1
            txt.text = num.toString()
        }

        kurang.setOnClickListener{
            num -= 1
            txt.text = num.toString()
        }

        reset.setOnClickListener{
            num = 0
            txt.text = num.toString()
        }

    }
}