package com.example.denemesecond.examples

import android.util.Log
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.denemesecond.R
import com.example.denemesecond.TAG
import com.example.denemesecond.ui.theme.DenemeSecondTheme
import com.example.denemesecond.ui.theme.Shapes

@Composable
fun GoogleButton(
    modifier: Modifier = Modifier,
    @StringRes text: Int = R.string.sign_up_google,
    @StringRes loadingText: Int = R.string.creating_acc,
    @DrawableRes icon: Int = R.drawable.ic_google,
    shape: Shape = Shapes.medium,
    @ColorRes borderColor: Color = Color.LightGray,
    @ColorRes backgroundColor: Color = MaterialTheme.colorScheme.surface,
    @ColorRes progressIndicatorColor: Color = MaterialTheme.colorScheme.primary,
    onClicked: () -> Unit,
) {
    var clicked by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier,
        shape = shape,
        color = backgroundColor,
        border = BorderStroke(width = 1.dp, color = borderColor),
        onClick = { clicked = !clicked },

        ) {
        // ÖNEMLİ_NOT: Row'a padding'ler eklerken kafamıza göre eklemiyoruz.
        // Elimizde bir design varsa ona göre ekliyoruz, yoksa da material3 design sayfasına gidip
        // aradığımız component için ne kadar boşluk bırakmamız gerektiğini öğreniyoruz.
        // bizim örneğimiz için material design'da start ve end padding'i belliydi, ancak top ve bottom belli değildi
        // bu nedenle biz de start ve end için bize verilen değerleri baz aldık, top ve bottom için de istediğimiz değerleri verdik.
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                )
                // button'umuz if yapısına göre büyüyüp küçülürken bunun animasyonla olmasını sağlıyoruz.
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            // Material design documentation'una göre icon ile yazı arasına 8 dp boşluk koymalıyız.
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = if (clicked) stringResource(loadingText) else stringResource(text))
            if (clicked) {
                Spacer(modifier = Modifier.width(8.dp))
                CircularProgressIndicator(
                    modifier = Modifier
                        .height(16.dp)
                        .width(16.dp),
                    strokeWidth = 2.dp,
                    color = progressIndicatorColor
                )
                // butona tıklandıktan sonra yapılacak clicked işlemi.
                onClicked()
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GoogleButtonPreview() {
    DenemeSecondTheme {
        GoogleButton(
            onClicked = { Log.d(TAG, "Google button clicked.") }
        )
    }
}