package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.startButton)
        val btnQuit = findViewById<Button>(R.id.quitButton)


        btnStart.setOnClickListener{
            val intent = Intent(this,learnCategoryActivity::class.java)
            startActivity(intent)

        }

        btnQuit.setOnClickListener{
            System.exit(-1)
        }


    }

}
