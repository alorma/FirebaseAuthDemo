package com.alorma.firebaseauth.demo

import android.app.Application
import com.alorma.firebaseauth.demo.domain.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DemoApplication)
            modules(domainModule)
        }
    }
}