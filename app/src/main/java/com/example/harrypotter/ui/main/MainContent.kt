package com.example.harrypotter.ui.main
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.nio.file.Paths.get


enum class Screen(val route: String){
    HOME("home"),
    CHARACTER("about"),
    SPELL("spells")

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent(harryState: HarryState){

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            MyBottomNavBar(navController = navController)
        },
        topBar ={

            MyTopAppbar(navController = navController, title = "Harry Porter")
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.HOME.route,
            modifier = Modifier.padding(it)
        ) {

                composable("home") {
                    Home(navController)
                }

                composable(Screen.CHARACTER.route) {
                    Characters(harryState)
                }
                composable(Screen.SPELL.route) {

                    Spell(harryState)
                }


        }

    }
}