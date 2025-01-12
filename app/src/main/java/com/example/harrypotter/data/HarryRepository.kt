package com.example.harrypotter.data

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.client.statement.readText

class HarryRepository(private val client: HttpClient) {
    suspend fun getHarryPorter(): List<Harry> {
        val response: HttpResponse = client.get(ApiEndpoints.CHARACTERS.url)
        val json = response.body<String>()


        return deserializeJson(json)
    }
    suspend fun getSpells(): List<Spells> {
        val response: HttpResponse = client.get(ApiEndpoints.SPELL.url)
        val json = response.body<String>()


        return spellserializeJson(json)
    }

    private fun deserializeJson(json: String): List<Harry> {
        return Gson().fromJson(json, object : TypeToken<List<Harry>>() {}.type)
    }
    private fun spellserializeJson(json: String): List<Spells> {
        return Gson().fromJson(json, object : TypeToken<List<Spells>>() {}.type)
    }
}

