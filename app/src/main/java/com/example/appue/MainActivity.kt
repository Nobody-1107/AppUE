package com.example.appue // Changed from com.example.apkd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

// Imports for your screens - ensure these paths are correct for your project structure
import com.example.apkd.Presentation.auth.LoginScreen
import com.example.apkd.Presentation.home.bienvenida
// It seems you have a duplicate import for bienvenida, you can remove one
// import com.example.apkd.Presentation.home.bienvenida

import com.example.appue.ui.theme.AppUETheme // Ensure this path is correct and the theme exists

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Use the imported AppUETheme here
            AppUETheme {
                MyAppNavHost()
            }
        }
    }
}

@Composable
fun MyAppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("bienvenida/{userName}") { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName")
            // Ensure 'bienvenida' composable is correctly defined and imported
            if (userName != null) { // Good practice to check for null
                bienvenida(userName = userName)
            }
        }
    }
}
