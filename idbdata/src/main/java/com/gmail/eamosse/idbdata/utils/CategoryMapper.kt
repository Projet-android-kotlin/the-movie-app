package com.gmail.eamosse.idbdata.utils

import com.gmail.eamosse.idbdata.api.response.CategoryResponse
import com.gmail.eamosse.idbdata.api.response.MoviesResponse
import com.gmail.eamosse.idbdata.data.Category
import com.gmail.eamosse.idbdata.data.Movie

fun CategoryResponse.Genre.toCategory() = Category(
    id = id!!,
    name = name!!
)

fun MoviesResponse.Results.toMovie() = Movie(
    id = id!!,
    title = title!!
)
