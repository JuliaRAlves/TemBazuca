package com.junyidark.tembazuca.data.model

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.domain.entities.MovieTitle

class MovieTitleModel(
    private val movieId: Int,
    private val titleLanguage: Language,
    private val title: String
) {
    fun toMovieTitle(): MovieTitle {
        return MovieTitle(
            movieId = movieId,
            titleLanguage = titleLanguage,
            title = title
        )
    }
}