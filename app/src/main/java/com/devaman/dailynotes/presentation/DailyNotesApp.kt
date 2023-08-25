package com.devaman.dailynotes.presentation

import android.os.strictmode.IncorrectContextUseViolation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.devaman.dailynotes.navigation.BottomNavItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailyNotesApp( navController: NavHostController = rememberNavController()) {

    val bottomNavItem = listOf(
        BottomNavItem(
            name = "Home",
            route = "home",
            selecteIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home

        ),
        BottomNavItem(
            name = "Search",
            route = "search",
            selecteIcon = Icons.Filled.Search,
            unselectedIcon = Icons.Outlined.Search

        ),
        BottomNavItem(
            name = "Setting",
            route = "setting",
            selecteIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Outlined.Settings
        )
    )

    val backStackEntry = navController.currentBackStackEntryAsState()

    Scaffold(
        bottomBar = {
            NavigationBar {

                bottomNavItem.forEachIndexed { index, item ->
                    NavigationBarItem(
                        alwaysShowLabel = true,
                        icon = {
                            if(backStackEntry.value?.destination?.route == item.route){
                                Icon(imageVector = item.selecteIcon, contentDescription = "" )
                            }else
                            {
                                Icon(imageVector = item.unselectedIcon, contentDescription = "" )
                            }
                        },
                        label = {
                                Text(text = item.name)
                        },

                        selected = backStackEntry.value?.destination?.route == item.route,
                        onClick = {
                            navController.navigate(item.route){
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop =true
                            }
                        }
                    )
                }
            }

        }
    ) {

        NavHost(
            navController = navController ,
            startDestination =  "home",
            modifier = Modifier.padding(it)
            ){

            composable(route = "home"){

              HomeScreen()
            }
            composable(route = "search"){
              SearchScreen()
            }
            composable(route = "setting"){
               SettingScreen()
            }

        }

    }
}