package com.example.mathisfuncom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class learnCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_category)

        val addBtn = findViewById<Button>(R.id.additionButton)
        val subBtn = findViewById<Button>(R.id.subtractionButton)
        val mulBtn = findViewById<Button>(R.id.multiplyButton)
        val divBtn = findViewById<Button>(R.id.divisionButton)

        addBtn.setOnClickListener{
            val intent = Intent(this,learnAdditionActivity::class.java)
            startActivity(intent)
        }

        subBtn.setOnClickListener{
            val intent = Intent(this,learnSubtractionActivity::class.java)
            startActivity(intent)
        }

        mulBtn.setOnClickListener{
            val intent = Intent(this,learnMultiplyActivity::class.java)
            startActivity(intent)
        }

        divBtn.setOnClickListener{
            val intent = Intent(this,learnDivisionActivity::class.java)
            startActivity(intent)
        }

    }
}
