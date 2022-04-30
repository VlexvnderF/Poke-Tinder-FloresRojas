package com.marquez.poke_tinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.AlarmClock
import com.marquez.poke_tinder.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    //Declaramos nuestro enlazador de vistas binding
    private lateinit var binding: ActivitySplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }

        Handler(Looper.getMainLooper()).postDelayed({ startActivity(intent); finish() },3000)
    }
}