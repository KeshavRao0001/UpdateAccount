package com.keshav.updateaccount

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButton() {
    Button(
        onClick = {
            //your onclick code
        }, shape = RoundedCornerShape(5.dp),
        modifier = Modifier.fillMaxWidth(),


        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
    )


    {
        Text(text = "Save & Continue", color = Color.White)
    }
}