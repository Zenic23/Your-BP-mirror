package com.example.healthmirror

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Health Monitor",
        state = WindowState(size = DpSize(485.dp, 850.dp))
        
    ) {
        HealthMonitorScreen()
    }
}


//The code you provided is a Kotlin application that uses the Compose UI library to create a simple window with a title "Health Monitor" and a size of 1000x600 pixels. The window contains a `HealthMonitorScreen` component, which is not defined in the provided code. 