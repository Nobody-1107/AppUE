package com.example.apkd.Presentation.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isEmailValid = email.contains("@") && email.isNotEmpty()
    var isPasswordValid = password.length >= 6

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text("Iniciar Sesión", style = MaterialTheme.typography.titleLarge)

        // Campo de correo electrónico
        Text("Correo electrónico")
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo electrónico") },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        )

        // Campo de contraseña
        Text("Contraseña")
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña") },
            placeholder = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { /* Handle login */ }
            )
        )

        // Mensajes de error
        if (!isEmailValid) {
            Text("Por favor, ingrese un correo válido", color = MaterialTheme.colorScheme.error)
        }
        if (!isPasswordValid) {
            Text("La contraseña debe tener al menos 6 caracteres", color = MaterialTheme.colorScheme.error)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botón de inicio de sesión
        Button(
            onClick = {
                // Si el login es exitoso, navega a la pantalla de bienvenida
                if (isEmailValid && isPasswordValid) {
                    navController.navigate("bienvenida/$email")
                }
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = isEmailValid && isPasswordValid
        ) {
            Text("Iniciar Sesión")
        }
    }
}