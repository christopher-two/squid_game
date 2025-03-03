package org.squid_game.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration? = null) =
    startKoin {
        appDeclaration?.invoke(this)
        modules(
            appModule,
            ViewModelModule
        )
    }