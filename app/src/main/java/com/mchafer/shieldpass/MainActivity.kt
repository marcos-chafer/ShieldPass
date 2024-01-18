package com.mchafer.shieldpass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.navigation.compose.rememberNavController
import com.mchafer.shieldpass.navigation.AppNavHost

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Starting point of the app
        setContent {
            MaterialTheme {
              AppNavHost(navController = rememberNavController())
            }
        }
    }

}