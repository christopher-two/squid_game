package org.squid_game.ui.screens.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.squid_game.utils.data.HomeState

class HomeViewModel: ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    fun update(update: HomeState.() -> HomeState) {
        _state.value = update(_state.value)
    }
}