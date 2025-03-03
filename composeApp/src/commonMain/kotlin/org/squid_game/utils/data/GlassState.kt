package org.squid_game.utils.data

import org.squid_game.data.Player

data class GlassState(
    val left: Glass?,
    val right: Glass?,
)

data class Glass(
    val player: Player?,
    val isCorrect: Boolean,
)