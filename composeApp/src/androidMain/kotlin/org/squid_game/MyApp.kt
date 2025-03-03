package org.squid_game

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.squid_game.di.ViewModelModule
import org.squid_game.di.appModule

class MyApp : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApp.applicationContext)
            printLogger()
            modules(appModule, ViewModelModule)
        }
    }
}