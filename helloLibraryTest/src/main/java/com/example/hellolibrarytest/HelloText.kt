package com.example.hellolibrarytest

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
fun HelloText(str: String) {
    Text(
        text = "Hello $str!"
    )
}