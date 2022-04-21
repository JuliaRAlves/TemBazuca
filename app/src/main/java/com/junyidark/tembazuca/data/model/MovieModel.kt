package com.junyidark.tembazuca.data.model

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.domain.entities.Movie

class MovieModel(
    private val id: Int,
    private val hasBazooka: Boolean
) {
    fun toMovie(): Movie {
        return Movie(
            this.id,
            hasBazooka
        )
    }
}