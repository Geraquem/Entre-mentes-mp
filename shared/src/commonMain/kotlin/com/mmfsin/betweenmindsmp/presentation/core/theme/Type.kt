package com.mmfsin.betweenmindsmp.presentation.core.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import betweenmindsmp.shared.generated.resources.Res
import betweenmindsmp.shared.generated.resources.alphazet
import betweenmindsmp.shared.generated.resources.august_shining
import betweenmindsmp.shared.generated.resources.barlow
import betweenmindsmp.shared.generated.resources.courier
import betweenmindsmp.shared.generated.resources.kineks
import betweenmindsmp.shared.generated.resources.manaspace

@Composable
fun alphazetFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.alphazet, weight = FontWeight.Normal))

@Composable
fun augustShiningFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.august_shining, weight = FontWeight.Normal))

@Composable
fun barlowFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.barlow, weight = FontWeight.Normal))

@Composable
fun courierFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.courier, weight = FontWeight.Normal))

@Composable
fun kineksFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.kineks, weight = FontWeight.Normal))

@Composable
fun manaspaceFont(): FontFamily =
    FontFamily(org.jetbrains.compose.resources.Font(Res.font.manaspace, weight = FontWeight.Normal))

@Composable
fun appTypography(): Typography = Typography(
        bodySmall = TextStyle(
            fontFamily = barlowFont(),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
        ),
        bodyLarge = TextStyle(
            fontFamily = barlowFont(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
        ),
        titleLarge = TextStyle(
            fontFamily = barlowFont(),
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
        ),
    )