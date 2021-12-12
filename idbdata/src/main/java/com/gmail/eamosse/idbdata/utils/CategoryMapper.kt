package com.gmail.eamosse.idbdata.utils

import com.gmail.eamosse.idbdata.api.response.CategoryResponse
import com.gmail.eamosse.idbdata.api.response.MovieDetailResponse
import com.gmail.eamosse.idbdata.api.response.MoviesResponse
import com.gmail.eamosse.idbdata.data.Category
import com.gmail.eamosse.idbdata.data.Movie
import com.gmail.eamosse.idbdata.data.MovieDetail

fun CategoryResponse.Genre.toCategory() = Category(
    id = id!!,
    name = name!!
)

fun MoviesResponse.Results.toMovie() = Movie(
    id = id!!,
    title = title!!
)

fun MovieDetailResponse.toMovieDetail() = MovieDetail(
    id = id!!,
    title = title!!,
    overview = overview!!,
    vote_count = vote_count!!,
    release_date = release_date!!,
    original_language = original_language!!
)
