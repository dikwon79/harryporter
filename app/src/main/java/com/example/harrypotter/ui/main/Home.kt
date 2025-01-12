package com.example.harrypotter.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter

@Composable
fun Home(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to Harry Potter App!", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        // Example Harry Potter image
        HarryImage()
    }
}

@Composable
fun HarryImage() {
    // Replace this URL with the actual URL of the Harry Potter image
    val imageUrl = "https://ik.imagekit.io/hpapi/harry.jpg"

    // Coil Image composable to load and display the image
    Image(
        painter = rememberAsyncImagePainter(imageUrl),
        contentDescription = null, // You can provide a content description if needed
        modifier = Modifier
            .size(200.dp)
            .clip(shape = MaterialTheme.shapes.medium),
        contentScale = ContentScale.Crop
    )

}