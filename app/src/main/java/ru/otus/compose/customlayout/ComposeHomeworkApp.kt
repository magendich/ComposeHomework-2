package ru.otus.compose.customlayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComposeHomeworkApp() {
    CustomLayoutHW(
        columns = 3,
        modifier = Modifier.systemBarsPadding()
            .padding(14.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(100.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(110.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(90.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(120.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(100.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(80.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(100.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(120.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(100.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
        Image(
            painter = painterResource(id = R.drawable.catanddot),
            contentDescription = null,
            Modifier.size(90.dp).padding(4.dp).border(2.dp, color = Color.Black)
        )
    }
}