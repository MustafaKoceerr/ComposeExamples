package com.example.denemesecond.examples

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.denemesecond.R
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
fun TextCustomizationFirst(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp)
                .fillMaxWidth(),
            color = Color.White,
            fontSize = MaterialTheme.typography.displayMedium.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(
    showBackground = true, name = "darkmode",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(showBackground = true, name = "lightmode")
@Composable
fun TextCustomizationFirstPreview() {
    DenemeSecondTheme {
        TextCustomizationFirst()
    }
}

@Preview(
    showBackground = true, name = "darkmode",
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(showBackground = true, name = "lightmode")
@Composable
fun TextCustomizationSecondPreview() {
    DenemeSecondTheme {
        TextCustomizationSecond()
    }
}

@Composable
fun TextCustomizationSecond(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.background,
                    )
                ) {
                    append("A")
                    withStyle(
                        style = ParagraphStyle(
                            textAlign = TextAlign.Center,
                        )
                    ) {
                        append("B")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.background,
                        )
                    ) {
                    }
                }
                append("B")
                append("C")
                append("D")
            }
        )
    }
}


@Composable
fun CustomText3(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hello world".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)

    }
}

@Preview(showBackground = true)
@Composable
fun CustomText3Preview() {
    DenemeSecondTheme {
        CustomText3()
    }
}


