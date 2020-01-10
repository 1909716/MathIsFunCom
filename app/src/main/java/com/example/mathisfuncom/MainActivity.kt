package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce = false
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
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed()
            }

            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show()

            Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false }, 2000)
        }
    }
}
