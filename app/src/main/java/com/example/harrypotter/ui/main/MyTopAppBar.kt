package com.example.harrypotter.ui.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppbar(navController : NavController, title: String){
    CenterAlignedTopAppBar(
        title = {
        Text(title)
    },
        navigationIcon = {
            IconButton(onClick = {
                navController.navigate(Screen.HOME.route)
            }){
                Icon(
                    Icons.Rounded.ArrowBack,
                    contentDescription = null
                )
            }
        },
        actions = {

            IconButton(onClick = {
                navController.navigate(Screen.HOME.route)
            }){
                Icon(
                    Icons.Rounded.Home,
                    contentDescription = null
                )
            }

        },
        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    )
}