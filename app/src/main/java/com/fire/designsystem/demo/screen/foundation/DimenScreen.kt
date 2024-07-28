package com.fire.designsystem.demo.screen.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.fire.designsystem.demo.Screen
import com.fire.designsystem.demo.component.HorizontalSpacer
import com.fire.designsystem.demo.component.VerticalSpacer
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.theme.FireTheme

fun NavGraphBuilder.addDimenScreen(
    navController: NavController
) {
    composable(Screen.DIMEN.name) {
        DimenScreen(
            onBackPressed = { navController.popBackStack() }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DimenScreen(
    onBackPressed: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Dimension",
                        color = FireTheme.colorScheme.onBackground,
                        style = FireTheme.typography.headlineSmall
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(FireTheme.dimension.extraSmall),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription = null,
                        modifier = Modifier.clickable(onClick = onBackPressed)
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(FireTheme.colorScheme.background)
                .verticalScroll(rememberScrollState())
                .padding(it)
        ) {
            DimenItemSet(
                dimensionText = "ExtraSmall",
                dimension = FireTheme.dimension.extraSmall
            )
            DimenItemSet(
                dimensionText = "Small",
                dimension = FireTheme.dimension.small
            )
            DimenItemSet(
                dimensionText = "Medium",
                dimension = FireTheme.dimension.medium
            )
            DimenItemSet(
                dimensionText = "Large",
                dimension = FireTheme.dimension.large
            )
            DimenItemSet(
                dimensionText = "ExtraLarge",
                dimension = FireTheme.dimension.extraLarge
            )
        }
    }
}

@Composable
private fun DimenItemSet(
    dimensionText: String,
    dimension: Dp,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(FireTheme.colorScheme.background)
            .padding(20.dp)
    ) {
        Text(
            text = dimensionText,
            style = FireTheme.typography.titleLarge,
            color = FireTheme.colorScheme.onBackground
        )
        VerticalSpacer(size = FireTheme.dimension.medium)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Padding",
                modifier = Modifier.weight(1f, true),
                style = FireTheme.typography.titleMedium,
                color = FireTheme.colorScheme.onBackground
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(FireTheme.colorScheme.primary)
            )
            HorizontalSpacer(size = dimension)
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(FireTheme.colorScheme.secondary)
            )
        }
        VerticalSpacer(size = FireTheme.dimension.medium)
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Spacing",
                modifier = Modifier.weight(1f, true),
                style = FireTheme.typography.titleMedium,
                color = FireTheme.colorScheme.onBackground
            )
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = FireTheme.colorScheme.tertiary,
                        shape = RoundedCornerShape(dimension)
                    )
            )
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewDimenScreen() {
    FireTheme {
        DimenScreen(
            onBackPressed = {}
        )
    }
}