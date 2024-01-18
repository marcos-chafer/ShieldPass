@file:OptIn(ExperimentalAnimationApi::class)

package com.mchafer.shieldpass.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mchafer.shieldpass.ui.components.LoginScreen
import com.mchafer.shieldpass.ui.components.PasswordManagerScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = "passwordmanager",
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
//        enterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left, tween(3000)) },
//        exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right, tween(3000)) },
//        popEnterTransition = { fadeIn(animationSpec = tween(3000)) },
//        popExitTransition = { fadeOut(animationSpec = tween(3000)) },

    ) {
        composable(route = "login")
        {
            LoginScreen(navController)
        }
        composable(route = "passwordmanager")
        {
           PasswordManagerScreen(navController)
        }

    }
}