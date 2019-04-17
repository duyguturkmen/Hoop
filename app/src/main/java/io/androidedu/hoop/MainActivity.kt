package io.androidedu.hoop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import io.androidedu.hoop.adapter.ChatListViewPagerAdapter
import io.androidedu.hoop.fragments.CallsFragment
import io.androidedu.hoop.fragments.CameraFragment
import io.androidedu.hoop.fragments.ChatsFragment
import io.androidedu.hoop.fragments.StatusFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_tab.*

class MainActivity : AppCompatActivity() {
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }
    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = ArrayList<Fragment>().apply {
            add(cameraFragment)
            add(callsFragment)
            add(chatsFragment)
            add(statusFragment)
        }

        val fragmentTitleList = ArrayList<String>().apply {
            add("Camera")
            add("Chats")
            add("Status")
            add("Calls")
        }

        wpHoopContaniew.adapter = ChatListViewPagerAdapter(fragmentList, fragmentTitleList, supportFragmentManager)
        tableLayout.setupWithViewPager(wpHoopContaniew)
        wpHoopContaniew.currentItem = 1
       // tableLayout.addOnTabSelectedListener(this)

    }

}
