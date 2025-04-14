package com.example.denemesecond.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
// bu şekilde composable fonksiyonunu daha fazla customize edebilirsin.
fun SuperScriptText(
    normalText: String,
    normalTextFontSize: TextUnit = MaterialTheme.typography.titleMedium.fontSize,
    superText: String,
    superTextFontSize: TextUnit = MaterialTheme.typography.bodySmall.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Text(buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = normalTextFontSize
                )
            ) {
                append(text = normalText)
            }
            withStyle(
                style = SpanStyle(
                    fontSize = superTextFontSize,
                    fontWeight = superTextFontWeight,
                    baselineShift = BaselineShift.Superscript
                )
            ) { append(text = superText) }
        })
    }
}


@Composable
fun SubScriptText(normalText: String, subText: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    )
                ) {
                    append(text = normalText)
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = MaterialTheme.typography.bodySmall.fontSize,
                        fontWeight = FontWeight.Normal,
                        baselineShift = BaselineShift.Subscript
                    )
                ) {
                    append(text = subText)
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SubScriptTextPreview() {
    DenemeSecondTheme {
        SubScriptText("NormalText", "SubText")
    }
}


@Preview(showBackground = true)
@Composable
fun SuperScriptTextPreview() {
    DenemeSecondTheme {
        SuperScriptText(normalText = "NormalText", superText = "SuperText")
    }
}