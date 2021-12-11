package com.gmail.eamosse.idbdata.api.response

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("results")
    val results: List<Results>

) {
    data class Results(
        @SerializedName("id")
        val id: Int,
        @SerializedName("description")
        val description: String,
        @SerializedName("favorite_count")
        val favorite_count: Int,
        @SerializedName("item_count")
        val item_count: Int,
        @SerializedName("iso_639_1")
        val iso_639_1: String,
        @SerializedName("list_type")
        val list_type: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("poster_path")
        val poster_path: String

    )
}
