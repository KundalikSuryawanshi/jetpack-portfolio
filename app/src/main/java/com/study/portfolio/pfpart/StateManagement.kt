package com.study.portfolio.pfpart

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

//@Composable
//fun StateManagement() {
//
//    var state by remember { mutableStateOf("")}
//
//    TextField(
//        value = state,
//        onValueChange = { state = it }
//    )
//}
//

@Composable
fun StateManagement(modifier: Modifier = Modifier) {

    var userName = ""

    var state = remember {
        mutableStateOf("")
    }

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        }
    )

}
