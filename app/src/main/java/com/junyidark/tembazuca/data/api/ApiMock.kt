package com.junyidark.tembazuca.data.api

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.data.IApi
import com.junyidark.tembazuca.data.model.MovieModel
import com.junyidark.tembazuca.data.model.MovieTitleModel

class ApiMock : IApi {
    override fun getMovieTitlesListIn(language: Language): List<MovieTitleModel> {
        return listOf(
            MovieTitleModel(
                movieId = 1,
                titleLanguage = language,
                title = "Kick-Ass: Quebrando Tudo"
            ),
            MovieTitleModel(
                movieId = 2,
                titleLanguage = language,
                title = "Xuxa e os duendes"
            ),
            MovieTitleModel(
                movieId = 3,
                titleLanguage = language,
                title = "O Resgate do Soldado Ryan"
            ),
        )
    }

    override fun getMovieById(movieId: Int): MovieModel {
        val hasBazooka = movieId == 1 || movieId == 3

        return MovieModel(
            id = movieId,
            hasBazooka = hasBazooka
        )
    }
}