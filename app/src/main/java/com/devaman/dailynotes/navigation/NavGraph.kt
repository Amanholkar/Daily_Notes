package com.devaman.dailynotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.devaman.dailynotes.presentation.AnimatedSplashScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController

) {

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route){

        composable(route = Screen.Splash.route){
             AnimatedSplashScreen(autoNavigation = {
                 navController.popBackStack()
                 navController.navigate(Screen.Home.route)
             })
        }

        composable(route = Screen.Home.route){

        }

    }

}