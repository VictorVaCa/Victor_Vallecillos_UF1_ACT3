package com.example.victor_vallecillos_uf1_act3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textViewHola: TextView = findViewById(R.id.textViewHola)
        val textViewMon: TextView = findViewById(R.id.textViewMon)

        textViewHola.text = getString(R.string.hola)
        textViewMon.text = getString(R.string.mon)

        textViewHola.setTextColor(ContextCompat.getColor(this, R.color.red))
        textViewMon.setTextColor(ContextCompat.getColor(this, R.color.blue))
    }
}