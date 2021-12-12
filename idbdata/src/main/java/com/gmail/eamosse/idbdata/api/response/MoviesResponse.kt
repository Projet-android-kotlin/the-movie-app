package com.gmail.eamosse.idbdata.api.response

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<Results>

) {
    data class Results(
        @SerializedName("id")
        val id: Int,
        @SerializedName("overview")
        val overview: String,
        @SerializedName("vote_count")
        val vote_count: Int,
        @SerializedName("title")
        val title: String,
        @SerializedName("release_date")
        val release_date: String,
        @SerializedName("original_language")
        val original_language: String

    )
}
