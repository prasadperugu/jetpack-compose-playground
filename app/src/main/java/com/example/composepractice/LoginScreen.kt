package com.example.composepractice


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    Column(
//        modifier = Modifier.fillMaxWidth(),//put it centre with half of the screen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        //enables center for both horizontal and vertical & cuts next compsables into the UI
        modifier = Modifier.fillMaxSize()

    ) {
//
        Image(
            painter = painterResource(id = R.drawable.liiltlemon), contentDescription ="",
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)

//                .clip(CircleShape)
//                //if I put padding the images corrupted for circular images
//                .padding(10.dp)

        )

        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Username") },
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Password") },
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57)
            )
        ) {
            Text(
                text = "Login",
                color = Color(0xFFEDEFEE)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}