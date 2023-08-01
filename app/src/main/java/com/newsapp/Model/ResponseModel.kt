package com.newsapp.Model

class ResponseModel(
    var status: String,
    var totalResult: Int,
    var articles:List<News>
) {
}