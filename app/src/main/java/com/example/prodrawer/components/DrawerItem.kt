package com.example.prodrawer.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prodrawer.R
import com.example.prodrawer.Screen
import kotlinx.coroutines.launch

@Composable
fun DrawerTextIcon(
    selected : Boolean,
    item : Screen.DrawerItems,
    onDrawerClickedEvent : () -> Unit

                    ){
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                onDrawerClickedEvent()
scope.launch {
    scaffoldState.drawerState.close()

}
            },
        horizontalArrangement = Arrangement.spacedBy(2.dp) // Space between icon and text
    ) {
       Icon(painter = painterResource(id = item.icon),   contentDescription = null,
           modifier = Modifier
               .width(24.dp)
               .height(24.dp) )
        Text(
            text = item.title,
            fontSize = 19.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .weight(1f) // Take up remaining space
                .padding(3.dp),
            fontFamily = FontFamily(
                Font(R.font.chrusty_orla)
            )

        )
    }
}

