package com.example.CalTrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.myLooper()!!).postDelayed({
            val mainIntent= Intent(this@SplashScreenActivity,MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        },2000)
    }
}