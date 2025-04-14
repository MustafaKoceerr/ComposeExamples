package com.example.denemesecond.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
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
// ColumnScope'a ekleyeceğimiz bir extension fonksiyon oluşturacağız, ve böylece weight verebileceğiz.
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colorScheme.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp)
            .weight(weight),
        color = color
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnDefaultPreview() {
    DenemeSecondTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colorScheme.primary
            ) {
            }
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colorScheme.primary
            ) {
            }
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colorScheme.primary
            ) {
            }
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp),
                color = MaterialTheme.colorScheme.primary
            ) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondDefaultPreview() {
    DenemeSecondTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .weight(3f),
                color = MaterialTheme.colorScheme.secondary
            ) {
            }
            Surface(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .weight(1f),
                color = MaterialTheme.colorScheme.primary
            ) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    DenemeSecondTheme {
        MainScreenColumn()
    }
}

@Composable
fun MainScreenColumn(modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .height(500.dp)
                .width(500.dp)
                .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomItem(
                weight = 3F,
                color = MaterialTheme.colorScheme.secondary
            )
            CustomItem(1f)
        }
    }
}