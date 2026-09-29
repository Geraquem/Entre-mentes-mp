package com.mmfsin.betweenmindsmp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mmfsin.betweenmindsmp.presentation.core.navigation.NavigationMain
import com.mmfsin.betweenmindsmp.presentation.core.theme.BetweenMindsMPTheme

@Composable
@Preview
fun App() {
    BetweenMindsMPTheme { NavigationMain() }
}