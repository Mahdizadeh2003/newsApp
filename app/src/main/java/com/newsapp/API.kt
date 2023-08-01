package com.newsapp

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("top-headlines")
    suspend fun getNews(
        @Query("sources") source: String,
        @Query("apiKey") apiKey: String
    ):retrofit2.Response<ResponseModel>
}