package com.fire.designsystem.demo.screen.foundation.dimen

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.fire.designsystem.demo.component.HorizontalSpacer
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.FireTheme

@Composable
fun DimenSpacingScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        SpacingAppliedBoxes(
            spacingText = "S",
            spacing = FireTheme.dimen.spacingS
        )
        SpacingAppliedBoxes(
            spacingText = "M",
            spacing = FireTheme.dimen.spacingM
        )
        SpacingAppliedBoxes(
            spacingText = "L",
            spacing = FireTheme.dimen.spacingL
        )
        SpacingAppliedBoxes(
            spacingText = "XL",
            spacing = FireTheme.dimen.spacingXL
        )
        SpacingAppliedBoxes(
            spacingText = "XXL",
            spacing = FireTheme.dimen.spacingXXL
        )
    }
}

@Composable
private fun SpacingAppliedBoxes(
    spacingText: String,
    spacing: Dp,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = spacingText,
            style = FireTheme.typo.h3
        )
        HorizontalSpacer(size = 20.dp)
        Row {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Black)
            )
            HorizontalSpacer(size = spacing)
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Black)
            )
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewDimenSpacingScreen() {
    FireTheme {
        DimenSpacingScreen()
    }
}