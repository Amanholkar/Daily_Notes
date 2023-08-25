package com.devaman.dailynotes.navigation

sealed class Screen(val route: String){

//    object Splash : Screen("splash_screen")
    object Home: Screen("home_screen")

    object Search: Screen("search_screen")

    object Setting : Screen("setting_screen")
}