package com.fire.designsystem.foundation.typo

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class FireTypo(
    val body: TextStyle = TextStyle.Default
)

val fireTypo = FireTypo(

)