package com.example.harrypotter.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.google.gson.annotations.SerializedName

data class Harry(
    val id: String,
    val name: String,
    val image: String
)
data class Spells(
    val id: String,
    val name : String,
    val description : String
)

data class NavItem(val icon: ImageVector, val navRoute:String)