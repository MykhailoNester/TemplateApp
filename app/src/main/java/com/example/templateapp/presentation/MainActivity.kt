package com.example.templateapp.presentation

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.templateapp.R
import com.example.templateapp.presentation.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            showMainContent()
        }
    }

    private fun showMainContent() {
        supportFragmentManager.beginTransaction().apply {
            replace(
                R.id.mainContainer,
                MainFragment.newInstance(),
                MainFragment::class.java.simpleName
            )
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            commitAllowingStateLoss()
        }
    }
}
