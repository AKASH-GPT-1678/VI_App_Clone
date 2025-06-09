package com.example.vodafoneidea.Presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.vodafoneidea.R
import com.example.vodafoneidea.ui.theme.DarkPurple
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vodafoneidea.ui.theme.DarkkPurple
import com.example.vodafoneidea.vi.components.OfferView


@Preview
@Composable
fun IntroScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(DarkkPurple) // Replace with DarkkPurple
            .padding(10.dp)
    ) {
        // Banner Image Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.frame_1_og),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }

        Row (
            modifier = Modifier.padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp) //

        ) {
           Image(
               painter = painterResource(R.drawable.ture_phone),
               contentDescription = null,
               modifier = Modifier.wrapContentSize()
           )
            Image(
                painter = painterResource(R.drawable.coins),
                contentDescription = null,
                modifier = Modifier.wrapContentSize()
            )
            Image(
                painter = painterResource(R.drawable.tikat),
                contentDescription = null,
                modifier = Modifier.wrapContentSize()
                    .rotate(90f)
            )

        }




        Spacer(modifier = Modifier.height(16.dp))

        // Bottom Text
        Text(
            text = "roz khelo , roz jeeto!",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = Color.White
        )
    }
}
