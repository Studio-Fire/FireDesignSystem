package com.fire.designsystem.demo.screen.foundation.dimen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
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
fun DimenPaddingScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        PaddingAppliedBox(
            paddingText = "S",
            padding = FireTheme.dimen.paddingS
        )
        PaddingAppliedBox(
            paddingText = "M",
            padding = FireTheme.dimen.paddingM
        )
        PaddingAppliedBox(
            paddingText = "L",
            padding = FireTheme.dimen.paddingL
        )
        PaddingAppliedBox(
            paddingText = "XL",
            padding = FireTheme.dimen.paddingXL
        )
        PaddingAppliedBox(
            paddingText = "XXL",
            padding = FireTheme.dimen.paddingXXL
        )
    }
}

@Composable
private fun PaddingAppliedBox(
    paddingText: String,
    padding: Dp,
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
            text = paddingText,
            style = FireTheme.typo.h3
        )
        HorizontalSpacer(size = 20.dp)
        Box(
            modifier = Modifier
                .background(color = Color.Black)
                .padding(padding)
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.White)
            )
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewDimenPaddingScreen() {
    FireTheme {
        DimenPaddingScreen()
    }
}