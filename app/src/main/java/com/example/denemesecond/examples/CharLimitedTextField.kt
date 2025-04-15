package com.example.denemesecond.examples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
fun CharLimitedTextField(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf("") }
        val maxChar = 10
        OutlinedTextField(
            value = name,
            onValueChange = {
                if (it.length <= maxChar)
                    name = it
            },
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Enter your name") },
            maxLines = 1
        )
    }

}


@Preview(showBackground = true)
@Composable
fun CharLimitedTextFieldPreview() {
    DenemeSecondTheme {
        CharLimitedTextField()
    }
}