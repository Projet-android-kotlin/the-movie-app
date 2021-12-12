package com.gmail.eamosse.idbdata.repository

import com.gmail.eamosse.idbdata.api.response.toEntity
import com.gmail.eamosse.idbdata.api.response.toToken
import com.gmail.eamosse.idbdata.data.Category
import com.gmail.eamosse.idbdata.data.Movie
import com.gmail.eamosse.idbdata.data.MovieDetail
import com.gmail.eamosse.idbdata.data.Token
import com.gmail.eamosse.idbdata.datasources.LocalDataSource
import com.gmail.eamosse.idbdata.datasources.OnlineDataSource
import com.gmail.eamosse.idbdata.utils.Result
import com.gmail.eamosse.idbdata.utils.toCategory
import com.gmail.eamosse.idbdata.utils.toMovie
import com.gmail.eamosse.idbdata.utils.toMovieDetail
import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 * La classe permettant de gérer les données de l'application
 */
class MovieRepository : KoinComponent {
    // Gestion des sources de données locales
    private val local: LocalDataSource by inject()
    // Gestion des sources de données en lignes
    private val online: OnlineDataSource by inject()

    /**
     * Récupérer le token permettant de consommer les ressources sur le serveur
     * Le résultat du datasource est converti en instance d'objets publiques
     */
    suspend fun getToken(): Result<Token> {
        return when (val result = online.getToken()) {
            is Result.Succes -> {
                // save the response in the local database
                local.saveToken(result.data.toEntity())
                // return the response
                Result.Succes(result.data.toToken())
            }
            is Result.Error -> result
        }
    }
    suspend fun getCategories(): Result<List<Category>> {
        return when (val result = online.getCategories()) {
            is Result.Succes -> {
                // On utilise la fonction map pour convertir les catégories de la réponse serveur
                // en liste de categories d'objets de l'application
                val categories = result.data.map {
                    it.toCategory()
                }
                Result.Succes(categories)
            }
            is Result.Error -> result
        }
    }

    suspend fun getMovieListByCategory(id: String): Result<List<Movie>> {
        return when (val result = online.getMovieListByCategory(id)) {
            is Result.Succes -> {
                // On utilise la fonction map pour convertir les movies de la réponse serveur
                // en liste de movie d'objets de l'application
                val movieLists = result.data.results.map {
                    it.toMovie()
                }
                Result.Succes(movieLists)
            }
            is Result.Error -> result
        }
    }
/*
    suspend fun getMovieDetail(id: Int): Result<MovieDetail> {
        return when (val result = online.getMovieDetail(id)) {
            is Result.Succes -> {
                // On utilise la fonction map pour convertir les movies de la réponse serveur
                // en liste de movie d'objets de l'application
                val movieDetail = result.data.toMovieDetail()
                }
                Result.Succes(movieDetail)
            }
            is Result.Error -> result
        }
    }*/
}
