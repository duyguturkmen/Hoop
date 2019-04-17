package io.androidedu.hoop.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ChatListViewPagerAdapter(
    val fragmentList: ArrayList<Fragment>,
    val titleList: ArrayList<String>,
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = fragmentList[position]


    override fun getCount(): Int = fragmentList.size


    override fun getPageTitle(position: Int): CharSequence? = titleList[position]

}