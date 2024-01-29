package com.example.prodrawer.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prodrawer.R

@Composable
fun ButtonComponent(){
Column(

) {


Row(
    modifier = Modifier.align(Alignment.CenterHorizontally),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
) {
    Button(onClick = {
                     //TODO
    } ,
        modifier = Modifier
            .clip(CircleShape)
            .padding(9.dp),
        colors = ButtonDefaults.buttonColors(Color.DarkGray)        ) {
        Text(text = "Profile", color = Color.White)

    }

    Button(onClick = {
                     //TODO
    } ,
        modifier = Modifier
            .clip(CircleShape)
            .padding(9.dp),
        colors = ButtonDefaults.buttonColors(Color.Red)        ) {
        Text(text = "Logout", color = Color.White)

    }

}}




}



@Preview(showBackground = true)
@Composable
fun PreviewButtonComponent(){
    ButtonComponent()
}