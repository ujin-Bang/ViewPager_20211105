package com.neppplus.viewpager_20211105.adpaters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211105.fragments.HelloFragment
import com.neppplus.viewpager_20211105.fragments.IntroduceFragment
import com.neppplus.viewpager_20211105.fragments.NameFragment

class MainviewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0-> HelloFragment()
            1-> NameFragment()
            else -> IntroduceFragment()
        }
    }
}