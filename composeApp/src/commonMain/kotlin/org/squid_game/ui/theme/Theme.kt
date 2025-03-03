package org.squid_game.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import squid_game.composeapp.generated.resources.Game_Of_Squids
import squid_game.composeapp.generated.resources.Res

val LightColorScheme = darkColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    background = background
)

@Composable
fun TitleFont(): TextStyle = TextStyle(
    fontFamily = FontFamily(Font(Res.font.Game_Of_Squids)),
    fontSize = 32.sp,
    fontWeight = FontWeight.Bold,
)

@Composable
fun MaterialThemeApp(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content,
        typography = MaterialTheme.typography.copy(
            titleLarge = TitleFont()
        )
    )
}