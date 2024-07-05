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
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun DimenRadiusScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FireTheme.colors.background)
            .verticalScroll(rememberScrollState())
    ) {
        RadiusAppliedBox(
            radiusText = "S",
            radius = FireTheme.dimen.radiusS
        )
        RadiusAppliedBox(
            radiusText = "M",
            radius = FireTheme.dimen.radiusM
        )
        RadiusAppliedBox(
            radiusText = "L",
            radius = FireTheme.dimen.radiusL
        )
        RadiusAppliedBox(
            radiusText = "XL",
            radius = FireTheme.dimen.radiusXL
        )
        RadiusAppliedBox(
            radiusText = "XXL",
            radius = FireTheme.dimen.radiusXXL
        )
        RadiusAppliedBox(
            radiusText = "XXL",
            radius = FireTheme.dimen.radiusCircular
        )
    }
}

@Composable
private fun RadiusAppliedBox(
    radiusText: String,
    radius: Dp,
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
            text = radiusText,
            style = FireTheme.typo.h4,
            color = FireTheme.colors.onBackground
        )
        HorizontalSpacer(size = 20.dp)
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(
                    color = FireTheme.colors.primary,
                    shape = RoundedCornerShape(size = radius)
                )
        )
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewDimenRadiusScreen() {
    FireTheme {
        DimenRadiusScreen()
    }
}