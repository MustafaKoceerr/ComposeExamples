package com.example.denemesecond.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SelectableText(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        SelectionContainer() {
            Column(modifier = modifier) {
                Text(text = "Hello World")
                DisableSelection {
                    Text(text = "Second Hello World")
                }
                Text(text = "Third Hello World")
            }
        }
    }
}