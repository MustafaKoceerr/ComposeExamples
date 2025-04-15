package com.example.denemesecond.examples

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.denemesecond.R
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
fun GradientButton(
    @StringRes text: Int,
    @ColorRes textColor: Color,
    gradient: Brush,
    onClick: () -> Unit,
) {
    Button(
        contentPadding = PaddingValues(),// bunun sayesinde butonumuz yuvarlak oluyor.
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent

        ), onClick = { onClick() }) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = stringResource(text), color = textColor)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GradientButtonPreview() {
    DenemeSecondTheme {
        val gradient = Brush.horizontalGradient(
            colors = listOf(Color(0xFFff00cc), Color(0xFF333399))
        )
        GradientButton(
            text = R.string.btn_name,
            textColor = Color.Blue,
            gradient = gradient,
            onClick = {})
    }
}