package com.fire.designsystem.demo.screen.foundation.dimen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fire.designsystem.demo.ext.PreviewWithUiMode
import com.fire.designsystem.foundation.FireTheme
import kotlinx.coroutines.launch

enum class DimensionType {
    SPACING, PADDING, RADIUS
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DimenScreen(
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState { DimensionType.entries.size }
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabRow(
            selectedTabIndex = selectedTabIndex
        ) {
            DimensionType.entries.forEach {
                Tab(
                    selected = selectedTabIndex == it.ordinal,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(it.ordinal)
                        }
                    },
                    modifier = Modifier.height(80.dp)
                ) {
                    Text(
                        text = it.name,
                        style = FireTheme.typo.h3
                    )
                }
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier = modifier.fillMaxSize()
        ) { page ->
            when (page) {
                DimensionType.SPACING.ordinal -> {
                    DimenSpacingScreen()
                }
                DimensionType.PADDING.ordinal -> {
                    DimenPaddingScreen()
                }
                DimensionType.RADIUS.ordinal -> {
                    DimenRadiusScreen()
                }
            }
        }
    }
}

@PreviewWithUiMode
@Composable
private fun PreviewDimenScreen() {
    FireTheme {
        DimenScreen()
    }
}
