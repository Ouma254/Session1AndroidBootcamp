package com.denisouma.session1_jetpackcompose

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.denisouma.session1_jetpackcompose.ui.theme.Session1JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Session1JetPackComposeTheme {
               //MyName()
               BootCampLearners()
                //ImagesExample()
                //FlowerName()
            }
        }
    }
}

@Composable
fun MyName(){
    Text(text = "ANDROID BOOTCAMP",
         color = Color.Blue,
         fontSize = 25.sp,
         fontWeight = FontWeight.Light,
         modifier = Modifier
             .padding(start = 16.dp, top = 4.dp, end = 0.dp, bottom = 2.dp)
             .fillMaxSize()
             .fillMaxHeight()
             .background(Color.Green)
    
    )
}

@Composable
fun BootCampLearners() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Blue)

    ) {
        MyName()
        Text(text = "Kevin")
        Text(text = "clinton")
        Text(text = "Denis")
        
    }
    
}

@Composable
fun FlowerName() {
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            ){
        Text(text = "SUNFLOWER",
             fontSize = 22.sp,
             color = Color.Yellow
        )
        Text(text = "$500")
    }
    
}

@Composable
fun BoxExample() {
    Box (modifier = Modifier
        .padding(16.dp)
        .width(200.dp)
        .height(200.dp)
        .background(Color.Red)) {
        Text(text = "HELLO WORLD",
             modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "world of fantancy",
             modifier = Modifier.align(Alignment.BottomCenter)
             )
    }
    
}

//@Composable
//fun ImagesExample() {
