package com.gmail.eamosse.idbdata.api.response

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(

    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("vote_count")
    val vote_count: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("release_date")
    val release_date: String,
    @SerializedName("original_language")
    val original_language: String,
    @SerializedName("poster_path")
    val poster_path: String

)
