package com.junyidark.tembazuca.data

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.data.adapter.toDomainMovieTitleList
import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.entities.MovieTitle
import com.junyidark.tembazuca.domain.interfaces.IRepository

class Repository(private val dataAccess: IApi) : IRepository {
    override fun getMovieTitlesListIn(language: Language): List<MovieTitle> {
        return dataAccess.getMovieTitlesListIn(language).toDomainMovieTitleList()
    }

    override fun getMovieById(movieId: Int): Movie {
        return dataAccess.getMovieById(movieId).toMovie()
    }
}