package org.squid_game.ui.navcontroller

import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.squid_game.ui.components.games.Glasses
import org.squid_game.ui.components.games.Lights
import org.squid_game.ui.components.games.Marbles
import org.squid_game.ui.components.games.TugOfWarGame
import org.squid_game.utils.routes.RoutesGames

@Composable
fun NavControllerGames(navController: NavHostController) {
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = RoutesGames.RedLightGreenLight.route,
        enterTransition = { slideInHorizontally { -it } },
        exitTransition = { slideOutHorizontally { it } }
    ) {
        composable(RoutesGames.RedLightGreenLight.route) { Lights() }
        composable(RoutesGames.TugofWar.route) { TugOfWarGame() }
        composable(RoutesGames.Marbles.route) { Marbles() }
        composable(RoutesGames.GlassBridge.route) { Glasses() }
        composable(RoutesGames.SquidGame.route) { }
        composable(RoutesGames.Rally.route) { }
    }
}