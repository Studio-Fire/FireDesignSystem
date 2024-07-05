package com.fire.designsystem.demo.ext

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO, locale = "ko")
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, locale = "ko")
annotation class PreviewWithUiMode