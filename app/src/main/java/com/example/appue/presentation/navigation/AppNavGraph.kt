package com.example.appue.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apkd.Presentation.auth.LoginScreen
import dev.aaron.appue.presentation.auth.RegisterScreen

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination= ""){

        composable("register"){ RegisterScreen(navController) }
        composable("login") { LoginScreen(navController) }

    }



}