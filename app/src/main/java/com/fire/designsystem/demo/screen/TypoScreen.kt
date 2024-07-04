package com.fire.designsystem.demo.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.fire.designsystem.demo.component.HorizontalSpacer
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.FireTheme

@Composable
fun TypoScreen(
    modifier: Modifier = Modifier
) {
    val text by remember { mutableStateOf("StudioFire입니다.") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        StyledTextSet(
            styleText = "h1",
            text = text,
            style = FireTheme.typo.h1,
            boldStyle = FireTheme.typo.h1Bold
        )
        StyledTextSet(
            styleText = "h2",
            text = text,
            style = FireTheme.typo.h2,
            boldStyle = FireTheme.typo.h2Bold
        )
        StyledTextSet(
            styleText = "h3",
            text = text,
            style = FireTheme.typo.h3,
            boldStyle = FireTheme.typo.h3Bold
        )
        StyledTextSet(
            styleText = "h4",
            text = text,
            style = FireTheme.typo.h4,
            boldStyle = FireTheme.typo.h4Bold
        )
        StyledTextSet(
            styleText = "body1",
            text = text,
            style = FireTheme.typo.body1,
            boldStyle = FireTheme.typo.body1Bold
        )
        StyledTextSet(
            styleText = "body2",
            text = text,
            style = FireTheme.typo.body2,
            boldStyle = FireTheme.typo.body2Bold
        )
        StyledTextSet(
            styleText = "body3",
            text = text,
            style = FireTheme.typo.body3,
            boldStyle = FireTheme.typo.body3Bold
        )
        StyledTextSet(
            styleText = "body4",
            text = text,
            style = FireTheme.typo.body4,
            boldStyle = FireTheme.typo.body4Bold
        )
    }
}

@Composable
private fun StyledTextSet(
    styleText: String,
    text: String,
    style: TextStyle,
    boldStyle: TextStyle,
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
            text = styleText,
            style = FireTheme.typo.h3
        )
        HorizontalSpacer(size = 20.dp)
        Column {
            Text(
                text = text,
                style = style
            )
            Text(
                text = text,
                style = boldStyle
            )
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewTypoScreen() {
    FireTheme {
        TypoScreen()
    }
}