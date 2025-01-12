package com.example.harrypotter.data

enum class ApiEndpoints(val url:String) {
    BASE_URL("https://hp-api.onrender.com/api"),
    CHARACTERS("${BASE_URL.url}/characters"),
    STUDENTS("{$CHARACTERS.url}/students"),
    STAFF("{$CHARACTERS.url}/staff"),
    SPELL("${BASE_URL.url}/spells"),
    FIELDS("{$CHARACTERS.url}/:id")


}