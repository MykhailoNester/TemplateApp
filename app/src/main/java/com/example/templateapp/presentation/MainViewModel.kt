package com.example.templateapp.presentation

import com.example.templateapp.presentation.base.BaseViewModel
import com.example.templateapp.source.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val dataRepository: Repository) :
    BaseViewModel() {

}
