package com.example.mathisfuncom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById(R.id.startButton) as Button
        val btnQuit = findViewById(R.id.quitButton) as Button

        btnStart.setOnClickListener{
            setContentView(R.layout.menu)
        }

        btnQuit.setOnClickListener{
            System.exit(-1)
        }

    }

}
