package com.junyidark.tembazuca.data

import com.junyidark.tembazuca.data.model.MovieModel

interface IApi {
    fun getMovieList(): List<MovieModel>
}