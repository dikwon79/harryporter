package com.example.harrypotter.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Spell(harryState: HarryState) {
    LaunchedEffect(
        key1 = harryState,
        block ={
            harryState.getSpeels()
        }
    )

    LazyColumn {
        items(harryState.spellwork.value.size) { index ->
            val spell = harryState.spellwork.value[index]

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
                    .clickable { /* Handle item click if needed */ },
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = spell.name, fontSize = 18.sp)
                    Text(text = spell.description, fontSize = 14.sp)
                }
            }
        }
    }
}
