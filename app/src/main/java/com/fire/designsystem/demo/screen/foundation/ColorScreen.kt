package com.fire.designsystem.demo.screen.foundation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fire.designsystem.demo.component.HorizontalSpacer
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.FireTheme

@Immutable
data class ColorSet(
    val name: String,
    val color: Color
)

@Composable
fun ColorScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("primary", FireTheme.colors.primary),
                ColorSet("onPrimary", FireTheme.colors.onPrimary),
                ColorSet("primaryContainer", FireTheme.colors.primaryContainer),
                ColorSet("onPrimaryContainer", FireTheme.colors.onPrimaryContainer),
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("secondary", FireTheme.colors.secondary),
                ColorSet("onSecondary", FireTheme.colors.onSecondary),
                ColorSet("secondaryContainer", FireTheme.colors.secondaryContainer),
                ColorSet("onSecondaryContainer", FireTheme.colors.onSecondaryContainer),
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("tertiary", FireTheme.colors.tertiary),
                ColorSet("onTertiary", FireTheme.colors.onTertiary),
                ColorSet("tertiaryContainer", FireTheme.colors.tertiaryContainer),
                ColorSet("onTertiaryContainer", FireTheme.colors.onTertiaryContainer),
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("background", FireTheme.colors.background),
                ColorSet("onBackground", FireTheme.colors.onBackground)
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("surface", FireTheme.colors.surface),
                ColorSet("onSurface", FireTheme.colors.onSurface),
                ColorSet("surfaceVariant", FireTheme.colors.surfaceVariant),
                ColorSet("onSurfaceVariant", FireTheme.colors.onSurfaceVariant)
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("outline", FireTheme.colors.outline),
                ColorSet("outlineVariant", FireTheme.colors.outlineVariant)
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("error", FireTheme.colors.error),
                ColorSet("onError", FireTheme.colors.onError),
                ColorSet("errorContainer", FireTheme.colors.errorContainer),
                ColorSet("onErrorContainerColor", FireTheme.colors.onErrorContainerColor),
            )
        )

        ColorAppliedBoxes(
            colorSets = listOf(
                ColorSet("surfaceContainer", FireTheme.colors.surfaceContainer),
            )
        )
    }
}

@Composable
private fun ColorAppliedBoxes(
    colorSets: List<ColorSet>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        colorSets.forEach {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = it.name,
                    style = FireTheme.typo.body1
                )
                HorizontalSpacer(size = 20.dp)
                Box(
                    modifier = Modifier
                        .size(width = 150.dp, height = 40.dp)
                        .background(it.color)
                )
            }
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewColorScreen() {
    FireTheme {
        ColorScreen()
    }
}