package com.example.templateapp.di

import com.example.templateapp.App

open class AppInjector(private val application: App) {

    fun component(): AppComponent {
        val appComponent = getAppComponent()
        appComponent.inject(application)
        return appComponent
    }

    protected open fun getAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .application(application)
            .build()
    }
}
