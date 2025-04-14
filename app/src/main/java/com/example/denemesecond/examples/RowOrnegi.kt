package com.example.denemesecond.examples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) { }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    DenemeSecondTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(
                weight = 3f,
                color = MaterialTheme.colorScheme.secondary
            )
            CustomItem(weight = 1f)
        }
    }
}

@Composable
fun MainScreenRow(modifier: Modifier = Modifier) {

    Surface(color = MaterialTheme.colorScheme.background,
        modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomItem(
                weight = 3f,
                color = MaterialTheme.colorScheme.secondary
            )
            CustomItem(weight = 1f)
        }
    }
}