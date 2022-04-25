package com.junyidark.tembazuca.data

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.data.model.MovieModel
import com.junyidark.tembazuca.data.model.MovieTitleModel

interface IApi {
    suspend fun getMovieTitlesListIn(language: Language): List<MovieTitleModel>
    fun getMovieById(movieId: Int): MovieModel
}