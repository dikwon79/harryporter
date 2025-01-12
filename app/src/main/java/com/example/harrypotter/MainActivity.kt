package com.example.harrypotter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import com.example.harrypotter.ui.main.HarryState
import com.example.harrypotter.ui.main.MainContent

//dongil kwon / A01267744

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val harryRepository = (application as MyApp).harryRepository

        setContent {
            val harryState = HarryState(harryRepository)

            MainContent(harryState = harryState)
        }
    }
}


