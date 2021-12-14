package com.gmail.eamosse.idbdata.data

data class MovieDetail(
    val id: Int,
    val overview: String,
    val vote_count: Int,
    val status: String,
    val title: String,
    val release_date: String,
    val original_language: String,
    val poster_path: String
)
