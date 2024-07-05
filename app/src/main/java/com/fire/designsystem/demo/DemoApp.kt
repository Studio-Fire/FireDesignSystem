package com.fire.designsystem.demo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.fire.designsystem.demo.screen.addHomeScreen
import com.fire.designsystem.demo.screen.foundation.addTypoScreen
import com.fire.designsystem.demo.screen.foundation.color.addColorScreen
import com.fire.designsystem.demo.screen.foundation.dimen.addDimenScreen
import com.fire.designsystem.foundation.FireTheme

enum class Screen {
    HOME,
    COLOR,
    TYPO,
    DIMEN
}

@Composable
fun FireDesignSystemDemoApp() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = FireTheme.colors.background
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.HOME.name,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            addHomeScreen { screen -> navController.navigate(screen.name) }
            addColorScreen()
            addTypoScreen()
            addDimenScreen()
        }
    }
}