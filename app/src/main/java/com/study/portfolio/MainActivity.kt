package com.study.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.study.portfolio.ui.ProjectHelper
import com.study.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortfolioTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }

                Portfolio()
            }
        }
    }
}

@Composable
fun Portfolio() {

    Surface(
        tonalElevation = 8.dp,
        shape = RoundedCornerShape(40.dp),
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxWidth()
//            .fillMaxHeight()
//            .height(300.dp)
            .padding(top = 20.dp)   // top margin
            .padding(10.dp)
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(android.R.drawable.btn_star_big_on),
                contentDescription = "No Image found!  ",
                Modifier.size(70.dp)
            )
            Divider(
                Modifier.padding(20.dp)
            )

            Text(
                text = "Gaurav Suryawanshi!",
                style = TextStyle(
                    color = Color.Red,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                text = "Software Engineer @AtomX",
                Modifier.padding(8.dp),
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            )
            Divider(
                Modifier.padding(20.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically //to make text center
            ) {
                Image(
                    painter = painterResource(android.R.drawable.ic_delete),
                    null,
                    Modifier.size(40.dp)
                )

                Text(
                    text = "/https:://kundalik.super.site",
                    style = TextStyle(
                        color = Color.DarkGray,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically //to make text center
            ) {
                Image(
                    painter = painterResource(id = android.R.drawable.ic_delete),
                    null,
                    Modifier.size(30.dp)
                )

                Text(
                    text = "/dev_gaurav",
                    style = TextStyle(
                        color = Color.DarkGray,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = painterResource(android.R.drawable.ic_delete), null,
                    Modifier.size(40.dp)
                )

                Text(
                    text = "kundalik_suryawanshi",
                    style = TextStyle(
                        color = Color.DarkGray,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                )
            }

            Divider(
                Modifier.padding(20.dp)
            )

            Spacer(Modifier.height(10.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                )
            ) {
                Text(
                    text = "My Projects",
                    color = Color.White,
                )
            }


            LazyColumn {
                item(ProjectHelper().getProductList()) {

                }
            }
        }

    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PortfolioTheme {
//        Greeting("Android")
        Portfolio()
    }
}