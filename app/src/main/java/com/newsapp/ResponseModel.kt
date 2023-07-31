package com.newsapp

class ResponseModel(
    var status: String,
    var totalResult: Int,
    var article:List<News>
) {
}