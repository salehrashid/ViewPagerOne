package com.app.viewpagerone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.viewpagerone.controller.PagerAdapter
import com.app.viewpagerone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.adapter = PagerAdapter(supportFragmentManager)

//        binding.tabLayout.setupWithViewPager(binding.viewpager)
//        binding.tabLayout.setTabTextColors(Color.GRAY, (Color.parseColor("black")))

        binding.tabLayout.apply {
            setupWithViewPager(binding.viewpager)
            setTabTextColors(Color.GRAY, (Color.parseColor("black")))
        }
    }
}