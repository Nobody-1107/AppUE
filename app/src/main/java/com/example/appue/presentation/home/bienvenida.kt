package com.example.apkd.Presentation.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun bienvenida(userName: String?) {
    Text("¡Bienvenido, $userName!", style = TextStyle(fontSize = 24.sp))
}

@Preview(showBackground = true)
@Composable
fun bienvenidaScreenPreview() {
    bienvenida(userName = "Juan Pérez")
}