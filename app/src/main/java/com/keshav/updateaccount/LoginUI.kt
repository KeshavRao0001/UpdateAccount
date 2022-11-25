package com.keshav.updateaccount

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.keshav.updateaccount.ui.theme.DeepBlue

@Composable
fun LoginUI(context: Context) {


    Column(
        modifier = Modifier
            .background(color = DeepBlue)
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Upadate Your Account",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()

        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .background(Color.White, RoundedCornerShape(5.dp)),
            shape = RoundedCornerShape(5.dp),
            value = "",
            onValueChange = {},
            textStyle = MaterialTheme.typography.caption
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .background(Color.White, RoundedCornerShape(5.dp)),
            shape = RoundedCornerShape(5.dp),
            value = "",
            onValueChange = {},
            textStyle = MaterialTheme.typography.caption
        )
        Column {

            SimpleCheckboxComponent()
        }
        BottomArea()

        MyButton()


    }

}