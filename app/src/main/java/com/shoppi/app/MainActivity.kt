package com.shoppi.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botttomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_main)
        botttomNavigationView.itemIconTintList = null


        val navController = supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()
        navController?.let {

            botttomNavigationView.setupWithNavController(it)
        }



    }
}