package com.fire.designsystem.foundation.dimen

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class FireDimen(
    val spacingS: Dp,
    val spacingM: Dp,
    val spacingL: Dp,
    val spacingXL: Dp,
    val spacingXXL: Dp,

    val paddingS: Dp,
    val paddingM: Dp,
    val paddingL: Dp,
    val paddingXL: Dp,
    val paddingXXL: Dp,

    val radiusS: Dp,
    val radiusM: Dp,
    val radiusL: Dp,
    val radiusXL: Dp,
    val radiusXXL: Dp,
    val radiusCircular: Dp = 1000.dp
)

val fireDimen = FireDimen(
    spacingS = 8.dp,
    spacingM = 16.dp,
    spacingL = 20.dp,
    spacingXL = 24.dp,
    spacingXXL = 32.dp,

    paddingS = 8.dp,
    paddingM = 16.dp,
    paddingL = 20.dp,
    paddingXL = 24.dp,
    paddingXXL = 32.dp,

    radiusS = 8.dp,
    radiusM = 16.dp,
    radiusL = 20.dp,
    radiusXL = 24.dp,
    radiusXXL = 32.dp
)