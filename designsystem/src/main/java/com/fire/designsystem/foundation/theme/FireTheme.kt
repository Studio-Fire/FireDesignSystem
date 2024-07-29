package com.fire.designsystem.foundation.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.fire.designsystem.foundation.color.fireColorSchemeDark
import com.fire.designsystem.foundation.color.fireColorSchemeLight
import com.fire.designsystem.foundation.dimension.Dimension
import com.fire.designsystem.foundation.dimension.fireDimension

val LocalColors = staticCompositionLocalOf { fireColorSchemeLight }
val LocalDimension = staticCompositionLocalOf { fireDimension }

@Composable
fun FireTheme(
    colorScheme: ColorScheme = if (isSystemInDarkTheme()) fireColorSchemeDark else fireColorSchemeLight,
    dimension: Dimension = fireDimension,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        val isDarkTheme = isSystemInDarkTheme()
        val background = if (isDarkTheme) {
            fireColorSchemeDark.background.toArgb()
        } else {
            fireColorSchemeLight.background.toArgb()
        }
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = background
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !isDarkTheme
        }
    }

    CompositionLocalProvider(
        LocalColors provides colorScheme,
        LocalDimension provides dimension
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}

object FireTheme {
    val typography: Typography
        @Composable
        get() = MaterialTheme.typography

    val colorScheme: ColorScheme
        @Composable
        get() = LocalColors.current
    val dimension: Dimension
        @Composable
        get() = LocalDimension.current
}