package com.gmail.eamosse.idbdata.utils

import com.gmail.eamosse.idbdata.api.response.CategoryResponse
import com.gmail.eamosse.idbdata.data.Category

fun CategoryResponse.Genre.toCategory() = Category (
    id = id!!,
    name= name!!
)