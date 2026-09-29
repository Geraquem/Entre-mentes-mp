package com.mmfsin.betweenmindsmp.presentation.core.components

//@Composable
//fun StatusBarColor(color: Color = Color.White, darkIcons: Boolean = true) {
//    val view = LocalView.current
//    SideEffect {
//        val window = (view.context as Activity).window
//        WindowCompat.setDecorFitsSystemWindows(window, true)
//        window.statusBarColor = color.toArgb()
//        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = darkIcons
//    }
//}
//
//@Composable
//fun StatusBarWhiteIcons() {
//    val view = LocalView.current
//    SideEffect {
//        val window = (view.context as Activity).window
//        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
//    }
//}
//
//fun Activity.setStatusBarIconsWhite() {
//    WindowCompat.getInsetsController(window, window.decorView)
//        .isAppearanceLightStatusBars = false
//}