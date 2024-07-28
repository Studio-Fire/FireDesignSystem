package com.fire.designsystem.demo

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.fire.designsystem.demo.screen.addHomeScreen
import com.fire.designsystem.demo.screen.foundation.addDimenScreen
import com.fire.designsystem.demo.screen.foundation.addTypoScreen

enum class Screen {
    HOME,
    TYPO,
    DIMEN
}

@Composable
fun FireDesignSystemDemoApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.HOME.name
    ) {
        addHomeScreen(navController)
        addTypoScreen(navController)
        addDimenScreen(navController)
    }
}