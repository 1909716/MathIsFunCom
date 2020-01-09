package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.startButton)
        val btnQuit = findViewById<Button>(R.id.quitButton)


        btnStart.setOnClickListener{
            val intent = Intent(this,menuActivity::class.java)
            startActivity(intent)

        }

        btnQuit.setOnClickListener{
            //System.exit(-1)

            if (doubleBackToExitPressedOnce) {
                super.onBackPressed()
            }

            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

            Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
        }


    }

}
