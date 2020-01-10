package com.example.mathisfuncom


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mathisfuncom.databinding.MenuBinding
import kotlinx.android.synthetic.main.level.*

class Level : AppCompatActivity() {

    private lateinit var binding: MenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.level)
        val strCat = intent.getStringExtra("Category")
        val buttonEasy = findViewById<View>(R.id.easyButton)
        val buttonMedium = findViewById<View>(R.id.mediumButton)
        val buttonHard = findViewById<View>(R.id.hardButton)

        buttonEasy.setOnClickListener {
            val intent = Intent(this, Test::class.java)
            intent.putExtra("Category",strCat)
            intent.putExtra("Level","1")
            // start your next activity
            startActivity(intent)
        }
        buttonMedium.setOnClickListener {
            val intent = Intent(this, Test::class.java)
            intent.putExtra("Category",strCat)
            intent.putExtra("Level","2")

            // start your next activity
            startActivity(intent)
        }
        buttonHard.setOnClickListener {
            val intent = Intent(this, Test::class.java)
            intent.putExtra("Category",strCat)
            intent.putExtra("Level","3")

            // start your next activity
            startActivity(intent)
        }



    }
}
