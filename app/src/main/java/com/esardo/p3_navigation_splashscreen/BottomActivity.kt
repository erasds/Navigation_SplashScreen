package com.esardo.p3_navigation_splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.esardo.p3_navigation_splashscreen.databinding.ActivityBottomBinding

class BottomActivity : AppCompatActivity() {
    //In place of the schedule fragments, I load into the schedule Drawer's item BottomActivity,
    //and BottomActivity loads the schedule fragments with the Bottom Navigation menu.
    lateinit var binding: ActivityBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(ActivityBottomBinding.inflate(layoutInflater).also { binding = it }.root)

        setSupportActionBar(binding.toolbar);

        val navController =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?)!!.navController

        NavigationUI.setupWithNavController(binding.bottomNavView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController);
    }
}