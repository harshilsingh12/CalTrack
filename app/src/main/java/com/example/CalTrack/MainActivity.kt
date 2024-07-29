package com.example.CalTrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var male:Button
    private lateinit var female:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        male = findViewById(R.id.male_bt)
        female = findViewById(R.id.female_bt)

        male.setOnClickListener {
            val intent = Intent(this, MaleCal::class.java)
            startActivity(intent)
        }

        female.setOnClickListener {
            val intent = Intent(this, FemaleCal::class.java)
            startActivity(intent)
        }
    }
}