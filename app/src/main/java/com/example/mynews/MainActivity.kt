package com.example.mynews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynews.Services.ApiClient
import com.example.mynews.Services.ApiInterface
import com.example.mynews.databinding.ActivityMainBinding
import com.example.mynews.databinding.ActivityMainBinding.inflate
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= inflate(layoutInflater)
        setContentView(binding.root)
        
        
    }
    
    fun fethArticles(){
        var apiClient = ApiClient.buildApiClient(ApiInterface::class.java)
        var request = apiClient.getArticles()

        request.enqueue(object : Callback<List<Articles>> {

        })

    }
}