package com.Netflixmirror.entities

data class SearchData(
    val head: String,
    val searchResult: List<SearchResult>,
    val type: Int
)