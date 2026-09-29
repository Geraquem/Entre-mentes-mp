package com.mmfsin.betweenmindsmp.presentation.core.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import betweenmindsmp.shared.generated.resources.Res
import betweenmindsmp.shared.generated.resources.app_name
import betweenmindsmp.shared.generated.resources.ic_error
import com.mmfsin.betweenminds.presentation.core.components.SpacerSmall
import com.mmfsin.betweenmindsmp.presentation.core.theme.Black
import com.mmfsin.betweenmindsmp.presentation.core.theme.GrayMedium
import com.mmfsin.betweenmindsmp.presentation.core.theme.OrangeMedium
import com.mmfsin.betweenmindsmp.presentation.core.theme.White
import com.mmfsin.betweenmindsmp.presentation.core.theme.alphazetFont
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource

@Preview
@Composable
fun ButtonCustomPV() {
    Column() {
        ButtonCustom(
            onClick = {},
            text = Res.string.app_name
        )
        SpacerSmall()
        ButtonCustomIcon(
            onClick = {},
            text = Res.string.app_name,
            icon = Res.drawable.ic_error,
        )
        SpacerSmall()
        OutlinedButtonCustom(
            onClick = {},
            text = Res.string.app_name
        )
    }
}

@Composable
fun ButtonCustom(
    onClick: () -> Unit,
    text: StringResource,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color = GrayMedium,
    textColor: Color = Black
) {
    Button(
        onClick = { onClick() },
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        shape = RoundedCornerShape(50)
    ) {
        MediumText(
            text = text,
            color = textColor,
            modifier = textModifier.padding(vertical = 4.dp),
            fontFamily = alphazetFont(),
            allCaps = true,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun ButtonCustomIcon(
    onClick: () -> Unit,
    text: StringResource,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    icon: DrawableResource,
    enabled: Boolean = true,
    color: Color = OrangeMedium,
    textColor: Color = White
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(50))
            .background(if (enabled) color else GrayMedium)
            .clickable(onClick = { if (enabled) onClick() })
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(icon), null,
            tint = White
        )
        SpacerSmall(horizontal = true)
        MediumText(
            text = text,
            color = textColor,
            modifier = textModifier.padding(vertical = 4.dp),
            fontFamily = alphazetFont(),
            allCaps = true
        )
    }
}

@Composable
fun OutlinedButtonCustom(
    onClick: () -> Unit,
    text: StringResource,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier,
    enabled: Boolean = true,
    textColor: Color = OrangeMedium
) {
    OutlinedButton(
        onClick = { onClick() },
        modifier = modifier,
        enabled = enabled,
        border = BorderStroke(1.dp, textColor),
        shape = RoundedCornerShape(50)
    ) {
        MediumText(
            text = text,
            color = textColor,
            modifier = textModifier.padding(vertical = 4.dp),
            fontFamily = alphazetFont(),
            allCaps = true
        )
    }
}