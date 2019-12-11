package com.example.templateapp

import android.app.Activity
import android.app.Application
import com.example.templateapp.di.AppComponent
import com.example.templateapp.di.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        createAppComponent().inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    private fun createAppComponent(): AppComponent {
        return AppInjector(this).component()
    }
}
