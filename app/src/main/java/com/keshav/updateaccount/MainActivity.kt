package com.keshav.updateaccount

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.keshav.updateaccount.ui.theme.DeepBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginUI(applicationContext)



        }
    }
}





@Composable
fun BottomArea() {
    Box(
        modifier = Modifier
            .padding(top = 20.dp, bottom = 20.dp)
            .size(400.dp, 400.dp)
            .background(color = colorResource(id = R.color.LightDB), RoundedCornerShape(20.dp)),


        contentAlignment = Alignment.TopStart


    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
                .size(300.dp, 60.dp)
                .background(color = colorResource(id = R.color.white), RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.TopStart
        ) {
            @Composable
            fun SwitchWithText() {
                Row(
                    Modifier
                        .width(320.dp)
                        .padding(horizontal = 16.dp)
                )

                {
                    Text(
                        text = "Enable Sports Betting",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(16.dp),
                        style = MaterialTheme.typography.subtitle1
                    )

                    Spacer(Modifier.weight(1f))
                    val checkedState = remember { mutableStateOf(true) }
                    Switch(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )

                }
            }
            SwitchWithText()


        }


        @Composable
        fun Text() {

            Text(
                text = "Add your interest for a more personalized experience",
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 12.sp,
            modifier = Modifier.padding(top = 80.dp, start = 80.dp,end=80.dp)
            )
        }

        @Composable
        fun ImageCard(painter: Painter,
                      contentDescription:String,
        modifier: Modifier = Modifier) {

            Card(modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation =  5.dp)
            {
             Box(modifier = Modifier.height(200.dp)){
                 Image(painter = painter, contentDescription = contentDescription,
                     contentScale = ContentScale.Crop
                 )
             }
            }

        }

        val painter = painterResource(id = R.drawable.jetpack)
        val description = "kehsav"
        Box(modifier = Modifier.fillMaxWidth(0.5f).padding(top = 100.dp)){
            ImageCard(
                painter = painter,
                contentDescription = description


            )
        }


    }

}



