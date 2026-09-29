package com.mmfsin.betweenmindsmp.presentation.menu.components

//
//@Composable
//fun ParticlesBackground() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .alpha(0.5f)
//    ) {
//
//        AndroidView(
//            modifier = Modifier.fillMaxSize(),
//            factory = { context ->
//                ParticlesView(context).apply {
//                    density = 200
//                    lineColor = ContextCompat.getColor(context, R.color.waves_blue)
//                    lineLength = 100.dpToPx(context)
//                    lineThickness = 2.dpToPx(context)
//                    particleColor = ContextCompat.getColor(context, R.color.white)
//                    speedFactor = 0.25f
//                }
//            }
//        )
//
//        AndroidView(
//            modifier = Modifier
//                .fillMaxSize()
//                .graphicsLayer {
//                    scaleY = -1f
//                },
//            factory = { context ->
//                ParticlesView(context).apply {
//                    density = 150
//                    lineColor = ContextCompat.getColor(context, R.color.waves_orange)
//                    lineLength = 100.dpToPx(context)
//                    lineThickness = 2.dpToPx(context)
//                    particleColor = ContextCompat.getColor(context, R.color.white)
//                    speedFactor = 0.75f
//                }
//            }
//        )
//    }
//}
//
//fun Int.dpToPx(context: Context): Float =
//    TypedValue.applyDimension(
//        TypedValue.COMPLEX_UNIT_DIP,
//        this.toFloat(),
//        context.resources.displayMetrics
//    )