package com.example.appue.presentation.auth

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){
    var email by remember { mutableStateOf(value="") }
    var password by remember { mutableStateOf(value="") }

    Column(
        modifier = Modifier.padding(16.dp)
    ){
      Text("Iniciar Sesión", style = MaterialTheme.typography.titleLarge)
        Text("Correo electrónico")
        TextField(value = email, onValueChange = {email = it})}

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Contraseña") },
        placeholder = { Text("Contraseña") },
        modifier = Modifier.padding(vertical = 16.dp)
    )

    Spacer(modifier = Modifier.height(16.dp))

    Button(onClick = {
        /*TODO*/
    },
        ){
        Text("Iniciar Sesión")
    }
}