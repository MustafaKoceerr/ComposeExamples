package com.example.denemesecond.examples

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter
import com.example.denemesecond.R

// NOT: Animasyon ekleme yapılacak, buna nasıl animasyon ekleyebilirim? yükleniyor simgesinden fotoğrafı yüklerken
@Composable
fun CoilImage(
    modifier: Modifier = Modifier,
    model: String = "https://avatars.githubusercontent.com/u/128032366?v=4",
    @DrawableRes placeholder: Int = R.drawable.ic_image_placeholder,
) {

    Box(
        modifier = modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    ) {
//        val painter = rememberAsyncImagePainter(model)
//
//        Image(
//            painter = painter,
//            contentDescription = null,
//            contentScale = ContentScale.Crop
//        )

        var isLoading by remember { mutableStateOf(true) }
        var isError by remember { mutableStateOf(true) }

        AsyncImage(
            model = model,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            onState = { state ->
                when (state) {
                    is AsyncImagePainter.State.Loading -> {
                        isLoading = true
                        isError = false
                        Log.d("AsyncImage", "Yükleniyor")
                    }

                    is AsyncImagePainter.State.Error -> {
                        isLoading = false
                        isError = true
                        Log.d("AsyncImage", "Hata")
                    }

                    is AsyncImagePainter.State.Success -> {
                        isLoading = false
                        isError = false
                        Log.d("AsyncImage", "Başarılı")
                    }

                    else -> {
                        isLoading = false
                        isError = false
                        Log.d("AsyncImage", "Diğer durum")
                    }
                }
            },

            // **2. Placeholder (Loading Indicator)**
        )// AsyncImage
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.size(48.dp),
                color = MaterialTheme.colorScheme.primary,
                strokeWidth = 4.dp
            )
        }
        // **3. Error Placeholder (Fallback UI)**
        if (isError) {
            Icon(
                painterResource(placeholder),
                contentDescription = "Error",
                tint = Color.Unspecified,
                modifier = Modifier.fillMaxSize()
            )
        }

    }
}