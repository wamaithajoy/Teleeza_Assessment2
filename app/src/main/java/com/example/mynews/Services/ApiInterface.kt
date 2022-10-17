package com.example.mynews.Services

import com.example.mynews.Articles
import retrofit2.http.GET

interface ApiInterface {
    @GET("/articles")
    fun getArticles(): List<Articles>
}
