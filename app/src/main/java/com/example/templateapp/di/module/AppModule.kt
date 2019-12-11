package com.example.templateapp.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ActivityBuilder::class, ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideAppContext(app: Application): Context = app.applicationContext
}
