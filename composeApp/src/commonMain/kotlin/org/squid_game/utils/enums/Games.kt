package org.squid_game.utils.enums

import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource
import org.squid_game.utils.routes.RoutesGames
import squid_game.composeapp.generated.resources.Res
import squid_game.composeapp.generated.resources.casino_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.category_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.crop_square_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.group_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.stars_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.strategy_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24
import squid_game.composeapp.generated.resources.traffic_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24

enum class Games(
    val title: String,
    val icon: DrawableResource,
    val color: Color,
    val route: String
) {
    RED_LIGHT_GREEN_LIGHT(
        title = RoutesGames.RedLightGreenLight.route,
        icon = Res.drawable.traffic_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFF0b6c56),
        route = RoutesGames.RedLightGreenLight.route
    ),
    TUG_OF_WAR(
        title = RoutesGames.TugofWar.route,
        icon = Res.drawable.group_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFF2517e9),
        route = RoutesGames.TugofWar.route
    ),
    MARBLES(
        title = RoutesGames.Marbles.route,
        icon = Res.drawable.casino_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFFf9ffff),
        route = RoutesGames.Marbles.route
    ),
    GLASS_BRIDGE(
        title = RoutesGames.GlassBridge.route,
        icon = Res.drawable.crop_square_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFF3bb7d1),
        route = RoutesGames.GlassBridge.route
    ),
    SQUID_GAME(
        title = RoutesGames.SquidGame.route,
        icon = Res.drawable.category_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFF1bf094),
        route = RoutesGames.SquidGame.route
    ),
    RALLY(
        title = RoutesGames.Rally.route,
        icon = Res.drawable.strategy_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24,
        color = Color(0xFF9f6d9e),
        route = RoutesGames.Rally.route
    )
}