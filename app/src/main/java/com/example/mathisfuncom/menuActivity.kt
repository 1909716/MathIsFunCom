package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTest = findViewById<Button>(R.id.testButton)
        val btnLearn = findViewById<Button>(R.id.learnButton)
        val btnChallenge = findViewById<Button>(R.id.challengeButton)

        btnTest.setOnClickListener{}

        btnLearn.setOnClickListener{
            val intent = Intent(this,learnCategoryActivity::class.java)
            startActivity(intent)
        }

        btnChallenge.setOnClickListener{}
    }
}
