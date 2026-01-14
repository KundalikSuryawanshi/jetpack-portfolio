package com.study.portfolio.pfpart

import android.R
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.study.portfolio.pfpart.ProjectHelper
import com.study.portfolio.pfpart.Projects
import com.study.portfolio.ui.theme.PortfolioTheme

private lateinit var projectList: List<Projects>

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortfolioTheme {
                Portfolio()
            }
        }

        projectList = ProjectHelper().getProductList()
    }
}

@Composable
fun Portfolio() {

    var isOpen = remember {
        mutableStateOf(false)
    }


    Surface(
        tonalElevation = 8.dp,
        shape = RoundedCornerShape(40.dp),
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxWidth()
//            .fillMaxHeight()
//            .height(300.dp)
            .padding(top = 50.dp)   // top margin
            .padding(10.dp)
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.btn_star_big_on),
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
                    painter = painterResource(R.drawable.ic_delete),
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
                    painter = painterResource(id = R.drawable.ic_delete),
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
                    painter = painterResource(R.drawable.ic_delete), null,
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


            Button(
                onClick = {
                    isOpen.value = !isOpen.value
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                )
            ) {
                Text(
                    text = "My Projects",
                    color = Color.White,
                )
            }

            Spacer(Modifier.height(10.dp))

            if (isOpen.value == true) {
                LazyColumn {
                    items(projectList) { projectItem ->
                        ProjectItem(projectItem = projectItem)
                    }
                }
            }

        }

    }
}


@Composable
fun ProjectItem(projectItem: Projects) {

    Surface(
        tonalElevation = 8.dp,
        shape = RoundedCornerShape(8.dp),
        color = Color.Cyan,
        modifier = Modifier
            .fillMaxWidth()
//            .fillMaxHeight()
//            .height(300.dp)
            .padding(5.dp)
    ) {

        Column(
//            horizontalAlignment = Alignment.CenterHorizontally
            Modifier.padding(10.dp)
        ) {

            Row (verticalAlignment = Alignment.CenterVertically){

                Image(
                    painter = painterResource(R.drawable.ic_delete), null,
                    Modifier.size(40.dp)
                )


                Column(
                    Modifier.padding(start = 20.dp)
                ) {
                    Text(
                        text = projectItem.projectId.toString(),
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp
                        )
                    )

                    Text(
                        text = projectItem.projectName,
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp
                        )
                    )

                    Text(
                        text = projectItem.projectDescription,
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontWeight = FontWeight.Light,
                            fontSize = 15.sp
                        )
                    )
                }
            }


        }


    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    PortfolioTheme {
////        Portfolio()
//        ProjectItem(
//            projectItem = Projects(
//                projectId = 1,
//                projectName = "Demo Project",
//                projectDescription = "This is preview data"
//            )
//        )
////        StateManagement()
//    }
//}


//note
/*
* dont use runtime data in preview composable
* need static data only
*
* composable recompose it self when there is change in state
*
* remember block -  keep the value of variable while recomposition
*
* */