package com.example.rickandmorty.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bottomNavListener()
    }

    private fun bottomNavListener() {
        binding.bNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.characterFragment -> {
                    Toast.makeText(this,"Character", Toast.LENGTH_SHORT).show()
                }
                R.id.episodesFragment -> {
                    Toast.makeText(this,"Episode", Toast.LENGTH_SHORT).show()
                }
                R.id.locationFragment -> {
                    Toast.makeText(this,"Location", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}