package com.Netflixmirrorn.entities

data class PostData(
    val desc: String?,
    val director: String?,
    val ua: String?,
    val episodes: List<Episode?>,
    val genre: String?,
    val nextPage: Int?,
    val nextPageSeason: String?,
    val nextPageShow: Int?,
    val season: List<Season>?,
    val title: String,
    val year: String,
    val cast: String?,
    val match: String?,
    val runtime: String?,
    val suggest: List<Id>?,
)

data class Id(val id: String)