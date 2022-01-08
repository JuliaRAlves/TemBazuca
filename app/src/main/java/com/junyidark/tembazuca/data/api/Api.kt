package com.junyidark.tembazuca.data.api

import com.junyidark.tembazuca.data.IApi
import com.junyidark.tembazuca.data.model.MovieModel

class Api : IApi {
    override fun getMovieList(): List<MovieModel> {
        return listOf(
            MovieModel(
                id = 1,
                nameEn = "Kick-Ass",
                namePt = "Kick-Ass",
                nameEs = "Kick-Ass",
                namePl = "Kick-Ass",
                nameDe = "Kick-Ass",
                hasBazooka = true
            ),
            MovieModel(
                id = 2,
                nameEn = "Cyborg-X",
                namePt = "Cyborg-X",
                nameEs = "Cyborg-X",
                namePl = "Cyborg-X",
                nameDe = "Cyborg-X",
                hasBazooka = true
            ),
            MovieModel(
                id = 3,
                nameEn = "Eragon",
                namePt = "Eragon",
                nameEs = "Eragon",
                namePl = "Eragon",
                nameDe = "Eragon",
                hasBazooka = false
            )
        )
    }
}