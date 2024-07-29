package com.example.CalTrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MaleCal : AppCompatActivity() {
    private lateinit var heightEt:EditText
    private lateinit var weightEt:EditText
    private lateinit var ageEt:EditText
    private lateinit var calculate: Button
    private lateinit var calories:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male_bmi)


        val r1 = findViewById<RadioButton>(R.id.r1)
        val r2 = findViewById<RadioButton>(R.id.r2)
        val r3 = findViewById<RadioButton>(R.id.r3)
        val r4 = findViewById<RadioButton>(R.id.r4)
        val r5 = findViewById<RadioButton>(R.id.r5)

        var value:Float = 0f

        r1.setOnCheckedChangeListener { compoundButton, b ->
            value = 1.20f
        }

        r2.setOnCheckedChangeListener { compoundButton, b ->
            value = 1.375f
        }

        r3.setOnCheckedChangeListener { compoundButton, b ->
            value = 1.55f
        }

        r4.setOnCheckedChangeListener { compoundButton, b ->
            value = 1.725f
        }

        r5.setOnCheckedChangeListener { compoundButton, b ->
            value = 1.90f
        }

        heightEt = findViewById(R.id.heightET)
        weightEt = findViewById(R.id.weightET)
        ageEt = findViewById(R.id.ageET)

        calculate = findViewById(R.id.calculate)

        calculate.setOnClickListener {
            var height = heightEt.text.toString().toFloat()
            var weight = weightEt.text.toString().toFloat()
            var age = ageEt.text.toString().toFloat()
            val bmr = (weight*10)+(6.25*height)+5-(5*age)
            val goal = bmr*value

            calories = findViewById(R.id.calories)

            calories.setText(goal.toString())
        }
    }
}