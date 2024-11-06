package com.muhammadagisnayudiansyah.intentappmodified

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intentapp.R

class MoveActivityWithData : AppCompatActivity() {
    companion object {
        const val YOUR_NIM = "your_nim"
        const val YOUR_NAME = "your_name"
        const val YOUR_CLASS = "your_class"
        const val YOUR_EMAIL = "your_email"
        const val YOUR_NUMBER = "your_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView= findViewById(R.id.tv_data_received)
        val tvDataReceived2: TextView= findViewById(R.id.tv_data_received2)
        val tvDataReceived3: TextView= findViewById(R.id.tv_data_received3)
        val tvDataReceived4: TextView= findViewById(R.id.tv_data_received4)
        val tvDataReceived5: TextView= findViewById(R.id.tv_data_received5)

        val nim = intent.getStringExtra(YOUR_NIM)
        val name = intent.getStringExtra(YOUR_NAME)
        val clas = intent.getStringExtra(YOUR_CLASS)
        val email = intent.getStringExtra(YOUR_EMAIL)
        val number = intent.getStringExtra(YOUR_NUMBER)

        val text = "NIM : $nim"
        val text2 = "Name : $name"
        val text3 = "Class : $clas"
        val text4 = "Email: $email"
        val text5 = "Number: $number"

        tvDataReceived.text = text
        tvDataReceived2.text = text2
        tvDataReceived3.text = text3
        tvDataReceived4.text = text4
        tvDataReceived5.text = text5

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}