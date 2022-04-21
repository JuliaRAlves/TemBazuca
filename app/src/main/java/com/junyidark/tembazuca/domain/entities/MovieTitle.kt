package com.junyidark.tembazuca.domain.entities

import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.core.utils.unaccented

class MovieTitle(
    val movieId: Int,
    val titleLanguage: Language,
    val title: String
) {
    fun titleMatches(query: String): Boolean {
        val titlePlan = title.lowercase().unaccented()
        val queryPlan = query.lowercase().unaccented().trimEnd()

        return titlePlan.contains(queryPlan)
    }
}