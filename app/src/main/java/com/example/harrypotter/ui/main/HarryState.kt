package com.example.harrypotter.ui.main

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.harrypotter.data.Harry
import com.example.harrypotter.data.HarryRepository
import com.example.harrypotter.data.Spells

class HarryState(private val harryRepository: HarryRepository){

    var harrywork : MutableState<List<Harry>> = mutableStateOf(emptyList())
    var spellwork : MutableState<List<Spells>> = mutableStateOf(emptyList())

    suspend fun getHarryPorter(){
        harrywork.value = harryRepository.getHarryPorter()
    }
    suspend fun getSpeels(){
        spellwork.value = harryRepository.getSpells()
    }
//    fun getImageurl(url: String) : String{
//        return harryRepository.getIamgeUrl(url)
//    }
}