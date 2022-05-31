package com.example.lesson_3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter: Int = 1
    private var counter_kat: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val textViewKat: TextView = findViewById(R.id.textViewKat)


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener() {
            textView.text = "Hello Kitti!"

        }
        val button_counter: Button = findViewById(R.id.button_counter)
        button_counter.setOnClickListener {
            textView.text = "Я насчитал ${counter++} ворон"
        }
        val button_counter_kat: Button = findViewById(R.id.button_counter_kat)
        button_counter_kat.setOnClickListener {
            textViewKat.text = "Я насчитал ${++counter_kat} котеек"
        }
    }
}