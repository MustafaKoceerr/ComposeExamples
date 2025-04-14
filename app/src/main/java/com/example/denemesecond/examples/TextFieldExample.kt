package com.example.denemesecond.examples

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.denemesecond.TAG
import com.example.denemesecond.ui.theme.DenemeSecondTheme

@Composable
fun TextFieldExample(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("type here...") }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = text, onValueChange = { newText ->
                text = newText
            }, label = {
                Text(text = "title")
            },
            singleLine = true,
            leadingIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
                }
            },
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.None
            ),
            keyboardActions = KeyboardActions(
                onDone = { },
                onGo = {
                    Log.d(TAG, "onGo button.")
                },
                onNext = { },
                onPrevious = { },
                onSearch = {
                    Log.d(TAG, "onSearch button.")
                },
                onSend = { }
            )
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            value = text, onValueChange = { newText ->
                text = newText
            }, label = {
                Text(text = "title")
            },
            singleLine = true,
            leadingIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
                }
            },
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.None
            ),
            keyboardActions = KeyboardActions(
                onDone = { },
                onGo = {
                    Log.d(TAG, "onGo button.")
                },
                onNext = { },
                onPrevious = { },
                onSearch = {
                    Log.d(TAG, "onSearch button.")
                },
                onSend = { }
            )
        )

//        Spacer(modifier = Modifier.height(12.dp))
//        BasicTextField(
//            value = text, onValueChange = { newText ->
//                text = newText
//            }, label = {
//                Text(text = "title")
//            },
//            singleLine = true,
//            leadingIcon = {
//                IconButton(onClick = {}) {
//                    Icon(imageVector = Icons.Default.Email, contentDescription = "")
//                }
//            },
//            trailingIcon = {
//                IconButton(onClick = {}) {
//                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
//                }
//            },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Email,
//                imeAction = ImeAction.None
//            ),
//            keyboardActions = KeyboardActions(
//                onDone = { },
//                onGo = {
//                    Log.d(TAG, "onGo button.")
//                },
//                onNext = { },
//                onPrevious = { },
//                onSearch = {
//                    Log.d(TAG, "onSearch button.")
//                },
//                onSend = { }
//            )
//        )

    }

}

@Preview(showBackground = true)
@Composable
fun TextFieldExamplePreview() {
    DenemeSecondTheme {
        TextFieldExample()
    }
}
