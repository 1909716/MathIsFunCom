package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mathisfuncom.databinding.MenuBinding
import kotlinx.android.synthetic.main.menu.*
import java.util.*

class Menu : AppCompatActivity() {

    //private lateinit var binding: MenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.menu)
        //binding = DataBindingUtil.setContentView(this, R.layout.menu)
        val buttonTest = findViewById<View>(R.id.testButton)
        val buttonLearn = findViewById<View>(R.id.learnButton)
        val buttonChallenge = findViewById<View>(R.id.challengeButton)

        buttonTest.setOnClickListener {
            val intent = Intent(this, Categories::class.java)
            // start your next activity
            startActivity(intent)
        }

        buttonLearn.setOnClickListener {
            val intent = Intent(this, learnCategoryActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


}
