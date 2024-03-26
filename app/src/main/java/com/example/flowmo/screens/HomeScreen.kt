package com.example.flowmo.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()


        setContent {
                Homescreen()
            }
    }
}



@Preview(showBackground = true)
@Composable
//home-screen
fun Homescreen() {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout {
            Row(
                modifier = Modifier
                    .padding(top = 48.dp, start = 10.dp, end = 10.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hello",
                        color = androidx.compose.ui.graphics.Color.Black,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Kammo Ji",
                        color = androidx.compose.ui.graphics.Color.Black,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 2.dp)
                    )

                    Row(
                        modifier = Modifier
                            .padding(top = 30.dp)
                    ) {

                        Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            shape = RoundedCornerShape(10.dp),



                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Click Me")
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "How are you feeling today",
                            color = androidx.compose.ui.graphics.Color.Black,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 2.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "MOOD ICONS",
                            color = androidx.compose.ui.graphics.Color.Black,
                            fontSize = 30.sp,

                            )
                    }


                    Row(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(
                            modifier = Modifier
                                .wrapContentWidth()
                                .height(50.dp),
                            shape = RoundedCornerShape(10.dp),



                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Click Me")
                        }

                        Button(
                            modifier = Modifier
                                .wrapContentWidth()
                                .height(50.dp),
                            shape = RoundedCornerShape(10.dp),



                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Click Me")
                        }

                        Button(
                            modifier = Modifier
                                .wrapContentWidth()
                                .height(50.dp),
                            shape = RoundedCornerShape(10.dp),



                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Click Me")
                        }

                    }

                    Row(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(),

                        ) {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            shape = RoundedCornerShape(10.dp),

                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "DIET")
                        }
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .fillMaxWidth(),

                        ) {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            shape = RoundedCornerShape(10.dp),

                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "EXERCISE")
                        }
                    }

                }

            }
        }
    }
}