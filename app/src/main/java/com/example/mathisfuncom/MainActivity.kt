package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart = findViewById<View>(R.id.startButton)
        val btnQuit = findViewById<View>(R.id.quitButton)
        buttonStart.setOnClickListener{

            val intent = Intent(this, Menu::class.java)
            // start your next activity
            startActivity(intent)
        }




        btnQuit.setOnClickListener{
            System.exit(-1)
        }
    }
}
