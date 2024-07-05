package com.fire.designsystem.foundation

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.fire.designsystem.foundation.color.FireColors
import com.fire.designsystem.foundation.color.fireColorsDark
import com.fire.designsystem.foundation.color.fireColorsLight
import com.fire.designsystem.foundation.dimen.FireDimen
import com.fire.designsystem.foundation.dimen.fireDimen
import com.fire.designsystem.foundation.typo.FireTypo
import com.fire.designsystem.foundation.typo.fireTypo

val LocalFireColors = staticCompositionLocalOf { fireColorsLight }
val LocalFireTypo = staticCompositionLocalOf { fireTypo }
val LocalFireDimen = staticCompositionLocalOf { fireDimen }

@Composable
fun FireTheme(
    colors: FireColors = if (isSystemInDarkTheme()) fireColorsDark else fireColorsLight,
    typo: FireTypo = fireTypo,
    dimen: FireDimen = fireDimen,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalFireColors provides colors,
        LocalFireTypo provides typo,
        LocalFireDimen provides dimen,
        content = content
    )
}

object FireTheme {
    val colors: FireColors
        @Composable
        get() = LocalFireColors.current
    val typo: FireTypo
        @Composable
        get() = LocalFireTypo.current
    val dimen: FireDimen
        @Composable
        get() = LocalFireDimen.current
}