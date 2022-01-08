package com.junyidark.tembazuca.data.model

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.domain.entities.Movie

class MovieModel(
    private val id: Int,
    private val namePt: String,
    private val nameEn: String,
    private val nameEs: String,
    private val nameDe: String,
    private val namePl: String,
    private val hasBazooka: Boolean
) {
    fun toMovie(): Movie {
        return Movie(
            this.id,
            getNameList(),
            hasBazooka
        )
    }

    private fun getNameList(): List<Pair<Language, String>> {
        return listOf(
            Pair(Language.PT, namePt),
            Pair(Language.EN, nameEn),
            Pair(Language.ES, nameEs),
            Pair(Language.DE, nameDe),
            Pair(Language.PL, namePl)
        )
    }
}