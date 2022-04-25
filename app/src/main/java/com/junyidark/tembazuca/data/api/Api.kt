package com.junyidark.tembazuca.data.api

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.core.utils.toStringCode
import com.junyidark.tembazuca.data.IApi
import com.junyidark.tembazuca.data.model.MovieModel
import com.junyidark.tembazuca.data.model.MovieTitleModel

class Api : IApi {
    override suspend fun getMovieTitlesListIn(language: Language): List<MovieTitleModel> {
        val database = Firebase.database.reference
        val languageCode = language.toStringCode()
        val childPathName = languageCode + "Names"

        val data = database.child(childPathName).get()


        if (data.isSuccessful) { //currently not working because it has to be async
            val result = data.result

            return if (result.exists() || result.hasChildren()) {
                result.children.map {
                    MovieTitleModel(
                        movieId = it.child("id").value.toString().toInt(),
                        titleLanguage = language,
                        title = it.key.toString()
                    )
                }
            } else {
                emptyList()
            }
        }

        return emptyList()
    }

    override fun getMovieById(movieId: Int): MovieModel {
        TODO("Not yet implemented")
    }
}