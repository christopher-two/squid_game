package org.squid_game

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.squid_game.ui.navcontroller.NavControllerStart
import org.squid_game.ui.theme.MaterialThemeApp

@Composable
@Preview
fun AppPc() {
    MaterialThemeApp {
        NavControllerStart()
    }
}
