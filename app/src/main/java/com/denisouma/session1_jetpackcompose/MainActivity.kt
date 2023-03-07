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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
                Scaffold(


                    topBar = {

                      TopAppBar(

                          backgroundColor = Color.Gray
                      ) {
                          Row(
                              modifier = Modifier.fillMaxWidth(),
                              horizontalArrangement = Arrangement.SpaceBetween,
                              verticalAlignment = Alignment.CenterVertically
                          ) {
                              Image(
                                  modifier = Modifier.size(25.dp),
                                  painter = painterResource(id = R.drawable.man ), contentDescription = null)
                              Icon(
                                  modifier = Modifier.size(30.dp),
                                  imageVector = Icons.Default.Notifications,
                                  contentDescription =null, )
                          }


                      }
                  }
                ) {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .clip(RoundedCornerShape(10.dp))
                         ){
                        items(50){

                            Card(
                                modifier = Modifier
                                    .padding(10.dp)) {
                                Image(
                                    painter = painterResource(id = R.drawable.leaf),
                                    contentDescription =null )
                                Box(modifier = Modifier
                                    .padding(
                                        horizontal = 0.dp,
                                        vertical = 25.dp
                                    )
                                    .background(color = Color.Transparent)) {
                                    Text(text = "Mount Kenya",
                                        modifier = Modifier.align(Alignment.BottomCenter),
                                        //fontWeight = 10.sp,
                                        //fontFamily = "Sans serif",
                                        )
                                    Text(text = "Meru, Kenya")

                                }

                            }
                        }

                    }


                }
            }
        }
    }
}

