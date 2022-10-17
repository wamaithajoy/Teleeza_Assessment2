package com.example.mynews.Services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org/v2/everything?q=Apple&from=2022-10-16&sortBy=popularity&apiKey=cdb1b330651a4d97b4b26c59e1d1c590")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(apiInterface: Class<T>): T{
        return retrofit.create(apiInterface)
    }
}