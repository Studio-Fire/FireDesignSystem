package com.fire.designsystem.foundation.typo

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class FireTypo(
    val h1: TextStyle,
    val h1Bold: TextStyle,

    val h2: TextStyle,
    val h2Bold: TextStyle,

    val h3: TextStyle,
    val h3Bold: TextStyle,

    val h4: TextStyle,
    val h4Bold: TextStyle,

    val body1: TextStyle,
    val body1Bold: TextStyle,

    val body2: TextStyle,
    val body2Bold: TextStyle,

    val body3: TextStyle,
    val body3Bold: TextStyle,

    val body4: TextStyle,
    val body4Bold: TextStyle
)

val fireTypo = FireTypo(
    h1 = TextStyle(
        fontSize = 32.sp,
        lineHeight = 48.sp
    ),
    h1Bold = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 48.sp
    ),

    h2 = TextStyle(
        fontSize = 28.sp,
        lineHeight = 42.sp
    ),
    h2Bold = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 42.sp
    ),

    h3 = TextStyle(
        fontSize = 24.sp,
        lineHeight = 36.sp
    ),
    h3Bold = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp
    ),

    h4 = TextStyle(
        fontSize = 20.sp,
        lineHeight = 30.sp
    ),
    h4Bold = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 30.sp
    ),

    body1 = TextStyle(
        fontSize = 14.sp,
        lineHeight = 21.sp
    ),
    body1Bold = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 21.sp
    ),

    body2 = TextStyle(
        fontSize = 12.sp,
        lineHeight = 18.sp
    ),
    body2Bold = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 18.sp
    ),

    body3 = TextStyle(
        fontSize = 10.sp,
        lineHeight = 15.sp
    ),
    body3Bold = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 15.sp
    ),

    body4 = TextStyle(
        fontSize = 8.sp,
        lineHeight = 12.sp
    ),
    body4Bold = TextStyle(
        fontSize = 8.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 12.sp
    )
)