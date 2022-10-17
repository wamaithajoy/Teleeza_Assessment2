package com.example.mynews

import com.google.gson.annotations.SerializedName

data class Articles(
    var title : String,
    var description: String,
    @SerializedName("UrlToImage") var urlToImage: String,

)
