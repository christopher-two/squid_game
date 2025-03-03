package org.squid_game.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.squid_game.ui.screens.home.HomeViewModel

val ViewModelModule = module {
    viewModelOf(::HomeViewModel)
}