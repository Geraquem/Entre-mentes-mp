@file:OptIn(ExperimentalMaterial3Api::class)

package com.mmfsin.betweenmindsmp.presentation.menu.components.selector

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import betweenmindsmp.shared.generated.resources.Res
import betweenmindsmp.shared.generated.resources.ic_human_down
import betweenmindsmp.shared.generated.resources.ic_human_up
import betweenmindsmp.shared.generated.resources.selector_questions_description_1
import betweenmindsmp.shared.generated.resources.selector_questions_description_2
import betweenmindsmp.shared.generated.resources.selector_questions_example_1
import betweenmindsmp.shared.generated.resources.selector_questions_example_2
import betweenmindsmp.shared.generated.resources.selector_questions_example_3
import com.mmfsin.betweenminds.presentation.core.components.SpacerMedium
import com.mmfsin.betweenminds.presentation.core.components.SpacerMini
import com.mmfsin.betweenminds.presentation.core.components.SpacerSmall
import com.mmfsin.betweenmindsmp.presentation.menu.components.selector.CardButtons
import com.mmfsin.betweenmindsmp.domain.models.GameType.QUESTIONS
import com.mmfsin.betweenmindsmp.presentation.core.components.MediumText
import com.mmfsin.betweenmindsmp.presentation.core.components.SmallText
import com.mmfsin.betweenmindsmp.presentation.core.theme.BackgroundBlack
import com.mmfsin.betweenmindsmp.presentation.core.theme.BlueMedium
import com.mmfsin.betweenmindsmp.presentation.core.theme.OrangeMedium
import com.mmfsin.betweenmindsmp.presentation.core.theme.courierFont
import com.mmfsin.betweenmindsmp.presentation.core.theme.kineksFont
import com.mmfsin.betweenmindsmp.utils.NAV_INSTR_QUESTIONS_ONLINE
import org.jetbrains.compose.resources.painterResource

@Preview(showBackground = true)
@Composable
fun CardQuestionsPV() {
    CardQuestions({}, {})
}

@Composable
fun CardQuestions(
    openInstructions: (String) -> Unit,
    play: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(Modifier.weight(1f))

        val questions = listOf(
            Res.string.selector_questions_example_1,
            Res.string.selector_questions_example_2,
            Res.string.selector_questions_example_3,
            //            R.string.selector_questions_example4,
        )

        questions.forEach { question ->
            SmallText(
                text = question,
                color = BackgroundBlack,
                fontFamily = courierFont(),
                fontWeight = FontWeight.SemiBold,
                gravity = TextAlign.Center,
            )
            SpacerSmall()
        }

        SpacerMedium()

        Column(
            Modifier.padding(horizontal = 24.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Icon(
                    painterResource(Res.drawable.ic_human_up), null,
                    modifier = Modifier.size(80.dp),
                    tint = BlueMedium
                )
                Icon(
                    painterResource(Res.drawable.ic_human_down), null,
                    modifier = Modifier.size(80.dp),
                    tint = OrangeMedium
                )
            }

            SpacerMini()

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                MediumText(
                    text = "65%",
                    color = BlueMedium,
                    fontSize = 30.sp,
                    fontFamily = kineksFont()
                )
                MediumText(
                    text = "35%",
                    color = OrangeMedium,
                    fontSize = 30.sp,
                    fontFamily = kineksFont()
                )
            }
        }

        Spacer(Modifier.weight(1f))

        SmallText(
            text = Res.string.selector_questions_description_1,
            color = BackgroundBlack,
        )

        SpacerSmall()

        SmallText(
            text = Res.string.selector_questions_description_2,
            color = BackgroundBlack,
        )

        Spacer(Modifier.weight(1f))

        CardButtons(
            openInstructions = { openInstructions(NAV_INSTR_QUESTIONS_ONLINE) },
            play = { play(QUESTIONS.id) }
        )
    }
}