package com.example.harrypotter.ui.main


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.harrypotter.data.Harry

@Composable
fun Characters(harryState: HarryState) {


    LaunchedEffect(
        key1 = harryState,
        block = {
            harryState.getHarryPorter()
        }
    )
    LazyColumn(content = {
        items(harryState.harrywork.value.chunked(2)) { // Split the list into pairs
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for (character in it) {
                    CharacterCard(character = character)
                }
            }
        }
    })
}

@Composable
fun CharacterCard(character: Harry) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .width(if (expanded) 250.dp else 200.dp)
            .height(if (expanded) 250.dp else 200.dp)
            .padding(8.dp)
            .clickable { expanded = !expanded }
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .padding(2.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                if (!expanded) {
                    Text(character.name, fontSize = 15.sp)
                }
                AsyncImage(
                    model = character.image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(if (expanded) 300.dp else 240.dp)
                )

            }
        }
    }
}