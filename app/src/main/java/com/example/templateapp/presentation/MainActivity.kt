package com.example.templateapp.presentation

import android.os.Bundle
import com.example.templateapp.R
import com.example.templateapp.presentation.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
