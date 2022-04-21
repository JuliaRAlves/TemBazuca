package com.junyidark.tembazuca.domain.interfaces

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.entities.MovieTitle

interface IRepository {
    fun getMovieTitlesListIn(language: Language): List<MovieTitle>
    fun getMovieById(movieId: Int): Movie
}