package org.squid_game.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ImageMask(
    drawable: DrawableResource,
    modifier: Modifier = Modifier,
    size: Dp,
    tint: Color
) {
    Icon(
        painter = painterResource(drawable),
        contentDescription = drawable.toString(),
        modifier = modifier.size(size),
        tint = tint
    )
}