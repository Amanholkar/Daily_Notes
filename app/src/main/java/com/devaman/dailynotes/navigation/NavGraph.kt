package com.devaman.dailynotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.devaman.dailynotes.presentation.AnimatedSplashScreen
import com.devaman.dailynotes.presentation.HomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController

) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route){

//        composable(route = Screen.Splash.route){
////             AnimatedSplashScreen(autoNavigation = {
////                 navController.popBackStack()
////                 navController.navigate(Screen.Home.route)
////             })
//        }

        composable(route = Screen.Home.route){
          HomeScreen()
        }

    }

}


