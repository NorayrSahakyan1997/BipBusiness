package com.example.bipbusiness

import android.app.Application
import com.example.bipbusiness.model.main.restclient.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
                        modules(retrofitModule("http://217.113.28.138:8080"))

        }
    }
}