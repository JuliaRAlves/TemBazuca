package com.junyidark.tembazuca.domain.entities

import com.junyidark.tembazuca.core.enums.Language

class Movie(
    private val id: Int,
    private val names: List<Pair<Language, String>>,
    private val hasBazooka: Boolean
) {
    fun isNamed(name: String): Boolean {
        return names.any {
            it.second == name
        }
    }

    fun hasBazooka(): Boolean {
        return hasBazooka
    }
}