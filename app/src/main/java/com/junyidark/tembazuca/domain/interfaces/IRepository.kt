package com.junyidark.tembazuca.domain.interfaces

import com.junyidark.tembazuca.domain.entities.Movie

interface IRepository {
    fun getMovieList(): List<Movie>
}