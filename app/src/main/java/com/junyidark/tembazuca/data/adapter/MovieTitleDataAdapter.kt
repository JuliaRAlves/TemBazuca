package com.junyidark.tembazuca.data.adapter

import com.junyidark.tembazuca.data.model.MovieTitleModel
import com.junyidark.tembazuca.domain.entities.MovieTitle

internal fun List<MovieTitleModel>.toDomainMovieTitleList(): List<MovieTitle> {
    return this.map { it.toMovieTitle() }
}