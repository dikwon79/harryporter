package com.example.harrypotter.ui.main
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Star

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.harrypotter.data.NavItem

@Composable
fun MyBottomNavBar(navController :NavController){

    val navItems = listOf(
        NavItem(Icons.Rounded.Home, Screen.HOME.route),
        NavItem(Icons.Rounded.Info, Screen.CHARACTER.route),
        NavItem(Icons.Rounded.Star, Screen.SPELL.route),

    )
    NavigationBar(containerColor = Color(0xFF255C56)) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        navItems.forEach{
            NavigationBarItem(
                selected = currentRoute == it.navRoute,
                onClick = {
                    navController.navigate(it.navRoute)

                },
                icon = {
                    Icon(it.icon, contentDescription = null)
                }
            )
        }
    }
}