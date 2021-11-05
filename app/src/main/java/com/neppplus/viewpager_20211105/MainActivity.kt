package com.neppplus.viewpager_20211105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20211105.adpaters.MainviewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainviewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setvalues()

    }

    fun setupEvents() {


    }
    fun setvalues() {
        mvpa = MainviewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa
    }

}