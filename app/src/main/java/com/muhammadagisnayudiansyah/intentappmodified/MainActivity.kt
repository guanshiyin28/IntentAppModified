package com.example.intentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muhammadagisnayudiansyah.intentappmodified.MoveActivityWithData

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivitywithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivitywithData.setOnClickListener(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this,MoveActivity::class.java)
                    startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this,MoveActivityWithData::class.java)
                    moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NIM,"312310505")
                    moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NAME,"Muhammad Agisna Yudiansyah")
                    moveIntentWithData.putExtra(MoveActivityWithData.YOUR_CLASS,"TI.23.B.2")
                    moveIntentWithData.putExtra(MoveActivityWithData.YOUR_EMAIL,"muhammadagisnayudiansyah@gmail.com")
                    moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NUMBER,"081381319442")
                    startActivity(moveIntentWithData)
            }
        }
    }
}