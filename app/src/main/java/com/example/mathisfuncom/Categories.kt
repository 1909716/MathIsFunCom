package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mathisfuncom.databinding.MenuBinding
import kotlinx.android.synthetic.main.menu.*
import java.util.*

class Categories : AppCompatActivity() {

    //private lateinit var binding: MenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.category)

        val buttonAdd = findViewById<View>(R.id.add_button)
        val buttonMinus = findViewById<View>(R.id.minus_button)
        val buttonTimes = findViewById<View>(R.id.times_button)
        val buttonDivide = findViewById<View>(R.id.divide_button)

        buttonAdd.setOnClickListener {
            val intent = Intent(this, Level::class.java)
            var cat = "+"
            intent.putExtra("Category",cat)
            // start your next activity
            startActivity(intent)
        }
        buttonMinus.setOnClickListener {
            val intent = Intent(this, Level::class.java)
            var cat = "-"
            intent.putExtra("Category",cat)
            // start your next activity
            startActivity(intent)
        }
        buttonTimes.setOnClickListener {
            val intent = Intent(this, Level::class.java)
            var cat = "*"
            intent.putExtra("Category",cat)
            // start your next activity
            startActivity(intent)
        }
        buttonDivide.setOnClickListener {
            val intent = Intent(this, Level::class.java)
            var cat = "÷"
            intent.putExtra("Category",cat)
            // start your next activity
            startActivity(intent)
        }
        }
    }



