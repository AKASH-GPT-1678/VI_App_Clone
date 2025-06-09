package com.example.vodafoneidea.vi.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vodafoneidea.R


@Composable
fun OfferView(
   content : String
){

        Column (
            modifier = Modifier
                .width(150.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.phone16),
                contentDescription = null
            )
            Text(text = content)
        }


    }





@Composable
@Preview
fun PreviewOffer(){
    OfferView(content = "Iphone16")
}