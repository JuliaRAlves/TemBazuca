package com.junyidark.tembazuca.data

import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.interfaces.IRepository

class Repository(private val dataAccess: IApi) : IRepository {
    override fun getMovieList(): List<Movie> {
        return dataAccess.getMovieList().map { it.toMovie() }
    }
}