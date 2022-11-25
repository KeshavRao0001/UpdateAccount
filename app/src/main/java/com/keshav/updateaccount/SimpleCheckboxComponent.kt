package com.keshav.updateaccount

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SimpleCheckboxComponent() {

    val checkedState = remember { mutableStateOf(true) }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(

            checked = checkedState.value,
            modifier = Modifier
                .padding(end = 20.dp, top = 20.dp)
                .height(1.dp)
                .width(1.dp),
            onCheckedChange = { checkedState.value = it },
        )
        Text(
            text = "Please send me mail and other marketing communications regarding my account and other products from NewCo.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            color = Color.White,
            fontSize = 12.sp

        )
    }
}