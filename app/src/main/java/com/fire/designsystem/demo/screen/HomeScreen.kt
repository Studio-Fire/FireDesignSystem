package com.fire.designsystem.demo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.fire.designsystem.demo.Screen
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.FireTheme
import com.fire.designsystem.foundation.color.onBackgroundDark
import com.fire.designsystem.foundation.color.onBackgroundLight

fun NavGraphBuilder.addHomeScreen(
    onNavigate: (Screen) -> Unit
) {
    composable(Screen.HOME.name) {
        HomeScreen(onClick = onNavigate)
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    screens: List<Screen> = Screen.entries - Screen.HOME,
    onClick: (Screen) -> Unit
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(FireTheme.colors.background)
    ) {
        items(screens) { screen ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(FireTheme.colors.surface)
                    .border(0.5.dp, FireTheme.colors.outline)
                    .clickable { onClick(screen) }
                    .padding(FireTheme.dimen.paddingM),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = screen.name,
                    style = FireTheme.typo.h4,
                    color = FireTheme.colors.onBackground
                )
            }
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewHomeScreen() {
    FireTheme {
        HomeScreen(onClick = {})
    }
}