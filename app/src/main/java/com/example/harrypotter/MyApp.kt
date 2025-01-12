package com.example.harrypotter

import android.app.Application
import com.example.harrypotter.data.HarryRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.gson.gson


class MyApp : Application(){

    private val client by lazy{
        HttpClient{
            install(ContentNegotiation){
                gson()
            }
        }
    }

    val harryRepository by lazy {
        HarryRepository(client)
    }
}