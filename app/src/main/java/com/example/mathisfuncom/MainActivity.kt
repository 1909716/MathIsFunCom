package com.example.mathisfuncom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.startButton)
        val btnQuit = findViewById<Button>(R.id.quitButton)
        //val btnLearn = findViewById<Button>(R.id.learnButton)

        btnStart.setOnClickListener{
            setContentView(R.layout.menu)

        }

        btnQuit.setOnClickListener{
            System.exit(-1)
        }


    }

}
