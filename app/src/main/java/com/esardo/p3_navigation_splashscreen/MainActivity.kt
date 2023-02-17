package com.esardo.p3_navigation_splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.esardo.p3_navigation_splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //With this the SplashScreen will show for 1 second at the start of the app
        setTheme(R.style.Theme_P3_Navigation_SplashScreen)
        Thread.sleep(1000)

        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)

        setSupportActionBar(binding.toolbar)

        //When the button is clicked it will load the DrawerActivity
        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, DrawerActivity::class.java))
        }

    }
}