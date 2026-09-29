package com.mmfsin.betweenmindsmp.presentation.menu.components.selector

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import betweenmindsmp.shared.generated.resources.Res
import betweenmindsmp.shared.generated.resources.ic_long_arrow
import betweenmindsmp.shared.generated.resources.selector_ranges_description_1
import betweenmindsmp.shared.generated.resources.selector_ranges_example_1_left
import betweenmindsmp.shared.generated.resources.selector_ranges_example_1_right
import betweenmindsmp.shared.generated.resources.selector_ranges_example_2_left
import betweenmindsmp.shared.generated.resources.selector_ranges_example_2_right
import com.mmfsin.betweenminds.presentation.core.components.SpacerMini
import com.mmfsin.betweenminds.presentation.core.components.SpacerSmall
import com.mmfsin.betweenmindsmp.presentation.menu.components.selector.CardButtons
import com.mmfsin.betweenmindsmp.domain.models.GameType.RANGES
import com.mmfsin.betweenmindsmp.presentation.core.components.MediumText
import com.mmfsin.betweenmindsmp.presentation.core.components.SmallText
import com.mmfsin.betweenmindsmp.presentation.core.theme.BackgroundBlack
import com.mmfsin.betweenmindsmp.utils.NAV_INSTR_RANGES_ONLINE
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource

@Preview(showBackground = true)
@Composable
fun CardRangesPV() {
    CardRanges({}, {})
}

@Composable
fun CardRanges(
    openInstructions: (String) -> Unit,
    play: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(Modifier.weight(1f))

        //        RangesSliderInstr(
        //            showBullseye = true,
        //            showSlider = false,
        //            bullseyePosition = 20f,
        //            sliderPosition = 0f,
        //            showRangeLimits = false
        //        )
        ExampleRangeLimits(
            Res.string.selector_ranges_example_1_left,
            Res.string.selector_ranges_example_1_right
        )
        SpacerMini()
        ExampleRangeLimits(
            Res.string.selector_ranges_example_2_left,
            Res.string.selector_ranges_example_2_right,
            showArrows = false
        )

        Spacer(Modifier.weight(1f))

        SmallText(
            text = Res.string.selector_ranges_description_1,
            color = BackgroundBlack
        )

        Spacer(Modifier.weight(1f))

        CardButtons(
            openInstructions = { openInstructions(NAV_INSTR_RANGES_ONLINE) },
            play = { play(RANGES.id) }
        )
    }
}


@Composable
fun ExampleRangeLimits(
    leftRange: StringResource,
    rightRange: StringResource,
    showArrows: Boolean = true
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            if (showArrows) {
                Icon(
                    painterResource(Res.drawable.ic_long_arrow), null,
                    tint = BackgroundBlack
                )
            }
            MediumText(
                text = leftRange,
                color = BackgroundBlack,
                modifier = Modifier.align(Alignment.Start).padding(start = 8.dp)
            )
        }

        SpacerSmall(horizontal = true)

        Column(
            modifier = Modifier.weight(1f)
        ) {
            if (showArrows) {
                Icon(
                    painterResource(Res.drawable.ic_long_arrow), null,
                    tint = BackgroundBlack,
                    modifier = Modifier.graphicsLayer { scaleX = -1f }
                )
            }
            MediumText(
                text = rightRange,
                color = BackgroundBlack,
                modifier = Modifier.align(Alignment.End).padding(end = 8.dp),
                gravity = TextAlign.End
            )
        }
    }
}