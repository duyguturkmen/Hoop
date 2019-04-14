package io.androidedu.hoop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import io.androidedu.hoop.fragments.CallsFragment
import io.androidedu.hoop.fragments.CameraFragment
import io.androidedu.hoop.fragments.ChatsFragment
import io.androidedu.hoop.fragments.StatusFragment
import kotlinx.android.synthetic.main.layout_tab.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }
    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(ChatsFragment())

        txtCalls.setOnClickListener(this)
        txtChats.setOnClickListener(this)
        txtStatus.setOnClickListener(this)
        buttonCamera.setOnClickListener(this)

        supportFragmentManager.beginTransaction().add(R.id.frameLayout, ChatsFragment.newInstance()).commit()

    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.txtCalls -> {
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, callsFragment)
                    .commit()
            }

            R.id.txtChats -> {
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, chatsFragment)
                    .commit()
            }

            R.id.txtStatus -> {
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, statusFragment)
                    .commit()
            }

            R.id.buttonCamera -> {
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, cameraFragment)
                    .commit()
            }
        }

    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }

    }

    inline fun FragmentManager.inTransaction(function: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().function().commit()
    }

    fun AppCompatActivity.addFragment(containerId: Int, fragment: Fragment) {
        supportFragmentManager.inTransaction {
            add(containerId, fragment)
        }
    }
    fun AppCompatActivity.replaceFragment(containerId: Int,fragment: Fragment){
        supportFragmentManager.inTransaction {
            replace(containerId,fragment)
        }
    }
}
