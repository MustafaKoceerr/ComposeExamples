package com.example.denemesecond

import android.os.Bundle
import android.util.Log
import androidx.compose.ui.graphics.Shape
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.denemesecond.ui.theme.DenemeSecondTheme
import com.example.denemesecond.ui.theme.Shapes

val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DenemeSecondTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
//                    MainScreenColumn(modifier = Modifier.padding(innerPadding))
//                    MainScreenRow(modifier = Modifier.padding(innerPadding))
//                    BoxExample(modifier = Modifier.padding(innerPadding))
//                    TextCustomizationFirst(modifier = Modifier.padding(innerPadding))
//                    TextCustomizationSecond(modifier = Modifier.padding(innerPadding))
//                    CustomText3(modifier = Modifier.padding(innerPadding))
//                    SelectableText(modifier = Modifier.padding(innerPadding))
//                    Column(modifier = Modifier.padding(innerPadding)) {
//                        SuperScriptText(
//                            normalText = "This is a normalText",
//                            superText = "This is a superText"
//                        )
//                        Spacer(modifier = Modifier.height(30.dp))
//                        SubScriptText(
//                            normalText = "This is a normalText",
//                            subText = "This is a subText"
//                        )

//                        ExpandableCard(R.string.title, R.string.lorem_ipsum, modifier = Modifier.padding(12.dp))
//                        TextFieldExample()
//                        GoogleButton(onClicked = {
//                            Log.d(TAG, "Google button clicked.")
//                        })

                    }
                }
            }
        }
    }
}


































