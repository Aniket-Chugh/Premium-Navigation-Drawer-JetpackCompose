package com.example.prodrawer.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DividerComponent(){
    Divider(thickness = 1.dp , color = Color.Gray , modifier = Modifier.padding(1.dp))
}

@Preview(showBackground = true)
@Composable
fun DividerComponentPreview(){
    DividerComponent()
}