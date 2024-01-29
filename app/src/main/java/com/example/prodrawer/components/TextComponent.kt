package com.example.prodrawer.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prodrawer.R


@Composable
fun HeadingComposable(text : String , fontSize : Int = 24 , color : Color = Color.White){
    Text(text = text, modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
        ,
        color = color
        ,
        fontSize = fontSize.sp,
        fontFamily = FontFamily(
            Font(R.font.chrusty_orla)
        )
    )
}




@Preview(showBackground = true)
@Composable
fun HeadingComposablePreview(){
}
