@file:OptIn(ExperimentalMaterial3Api::class)

package com.mmfsin.betweenmindsmp.presentation.core.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import betweenmindsmp.shared.generated.resources.Res
import betweenmindsmp.shared.generated.resources.back
import betweenmindsmp.shared.generated.resources.how_to_play
import betweenmindsmp.shared.generated.resources.ic_arrow_back
import com.mmfsin.betweenminds.presentation.core.components.SpacerMini
import com.mmfsin.betweenmindsmp.presentation.core.theme.BackgroundBlack
import com.mmfsin.betweenmindsmp.presentation.core.theme.White
import com.mmfsin.betweenmindsmp.presentation.core.theme.kineksFont
import org.jetbrains.compose.resources.painterResource

@Preview
@Composable
fun CustomToolbarPV() {
    CustomToolbar({}, {}, true)
}

@Composable
fun CustomToolbar(
    goBack: () -> Unit,
    goToInstructions: () -> Unit = {},
    showInstructions: Boolean = true
) {
    TopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Row(
                    modifier = Modifier.clickable(onClick = { goBack() }),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(Res.drawable.ic_arrow_back), null,
                        tint = White
                    )
                    SpacerMini(horizontal = true)
                    MediumText(
                        text = Res.string.back,
                        color = White,
                        fontFamily = kineksFont()
                    )
                }
                Spacer(Modifier.weight(1f))

                if (showInstructions) {
                    MediumText(
                        text = Res.string.how_to_play,
                        color = White,
                        fontFamily = kineksFont(),
                        modifier = Modifier.padding(end = 16.dp).clickable(onClick = { goToInstructions() })
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = BackgroundBlack),
    )
}