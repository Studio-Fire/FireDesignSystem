package com.fire.designsystem.demo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.fire.designsystem.demo.Screen
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.theme.FireTheme

fun NavGraphBuilder.addHomeScreen(
    navController: NavController
) {
    composable(Screen.HOME.name) {
        HomeScreen(
            navigateTo = { navController.navigate(it.name) }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    screens: List<Screen> = Screen.entries - Screen.HOME,
    navigateTo: (Screen) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "FireDesignSystem",
                        color = FireTheme.colorScheme.onBackground,
                        style = FireTheme.typography.headlineSmall
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(FireTheme.dimension.extraSmall)
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(FireTheme.colorScheme.background)
                .padding(it)
        ) {
            items(screens) { screen ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(FireTheme.colorScheme.surface)
                        .border(0.5.dp, FireTheme.colorScheme.outline)
                        .clickable { navigateTo(screen) }
                        .padding(FireTheme.dimension.medium),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = screen.name,
                        style = FireTheme.typography.bodyMedium,
                        color = FireTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewHomeScreen() {
    FireTheme {
        HomeScreen(
            navigateTo = {}
        )
    }
}