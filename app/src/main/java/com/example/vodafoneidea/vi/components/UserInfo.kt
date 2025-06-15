package com.example.vodafoneidea.vi.components


import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.CardElevation
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.vodafoneidea.ui.theme.Red
import com.example.vodafoneidea.R

@Composable
fun UserDetails() {
    Column(
        modifier = Modifier.padding(14.dp)
    ) {



        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(6.dp , top = 10.dp)
        ) {
            Column {
                Text(
                    text = "1.3 GB",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 24.sp
                )
                Text(
                    text = "available",
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "truly unlimited calls >",
                fontWeight = FontWeight.Bold
            )
        }

        HorizontalDivider(modifier = Modifier.padding(3.dp , top = 8.dp ))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 6.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "unlimited $155 (last recharge)",
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(text = "pack ends on 29th June , 2025")

            Spacer(modifier = Modifier.height(10.dp))

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(14.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Red)
                        .padding(12.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "recharge now", color = Color.White)
                }
            }

            Text(text = "no extra charges on recharges via Vi app", fontWeight = FontWeight.Bold , modifier = Modifier.padding(bottom = 20.dp))

            HorizontalDivider()
            Text(text = "Enjoy your favorite sport non stop", modifier = Modifier.padding(top = 32.dp), fontWeight = FontWeight.Bold , fontSize = 20.sp)



        }

        Spacer(modifier = Modifier.padding(8.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // adjust spacing as needed
        ) {
            item { OfferCard() }
            item { OfferCard() }
            item { OfferCard() }
        }


    }
}


@Composable
@Preview
fun OfferCard(){
    Card (
        elevation = CardDefaults.cardElevation(8.dp),

        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .height(150.dp)
            .width(120.dp)


    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "$199", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.viiilogo),
                contentDescription = "logo",
                modifier = Modifier.size(30.dp).padding(2.dp)
            )


        }
        HorizontalDivider(modifier = Modifier.padding(4.dp , top = 6.dp))



        CardDetails(
            icon = painterResource(R.drawable.data),
            description = "5 GB "
        )

        CardDetails(
            icon = painterResource(R.drawable.data),
            description = "mobile only"
        )
        CardDetails(
            icon = painterResource(R.drawable.data),
            description = "30 Days  >> "
        )


    }
}


@Composable
fun CardDetails(
    icon: Painter,
    description : String
){
    ConstraintLayout (
        modifier = Modifier.padding(8.dp , top = 8.dp)
    ) {

        val (imageref , textref) = createRefs()
        Image(
            painter = icon,
            contentDescription = "icon",
            modifier = Modifier.size(12.dp)
                .constrainAs(imageref){

                }
        )
        Text(text = description , modifier = Modifier.constrainAs(textref){
            start.linkTo(imageref.end, margin = 4.dp) //
        } , fontSize = 12.sp)


    }
}



@Preview
@Composable
private fun PreviewDetails(){
    CardDetails(
        icon = painterResource(R.drawable.data),
        description = "5 GB Unlimited"
    )

}


@Composable
@Preview
private fun PreviewUserdetails(){
    UserDetails()
}