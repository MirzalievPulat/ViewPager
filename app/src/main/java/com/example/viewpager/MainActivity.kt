package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        var adapter = Adapter(supportFragmentManager)
        adapter.add(Fragment1(),"Fragment1")
        adapter.add(Fragment2(),"Fragment2")
        adapter.add(Fragment3(),"Fragment3")
        adapter.add(Fragment4(),"Fragment4")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

    }
}