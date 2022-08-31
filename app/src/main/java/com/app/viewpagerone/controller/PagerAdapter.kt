package com.app.viewpagerone.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.app.viewpagerone.view.AboutFragment
import com.app.viewpagerone.view.SkillFragment
import com.app.viewpagerone.view.WorkFragment

class PagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position){
            0 -> AboutFragment()
            1 -> SkillFragment()
            2 -> WorkFragment()
        }
        return AboutFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position){
            0 -> return "HOME"
            1 -> return "SKILL"
            2 -> return "WORK"
        }
        return super.getPageTitle(position)
    }
}