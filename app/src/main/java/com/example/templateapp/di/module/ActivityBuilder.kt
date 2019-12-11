package com.example.templateapp.di.module

import com.example.templateapp.presentation.MainFragment
import com.example.templateapp.presentation.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    internal abstract fun provideMainActivity(): MainActivity

    @Module
    internal abstract inner class MainFragmentModule {
        @ContributesAndroidInjector
        abstract fun provideMainFragment(): MainFragment
    }
}
