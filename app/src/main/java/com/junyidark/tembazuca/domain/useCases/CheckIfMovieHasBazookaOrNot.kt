package com.junyidark.tembazuca.domain.useCases

import com.junyidark.tembazuca.core.Log
import com.junyidark.tembazuca.core.exceptions.MovieNotFoundException
import com.junyidark.tembazuca.core.utils.getAppLanguage
import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.entities.MovieTitle
import com.junyidark.tembazuca.domain.interfaces.IRepository

class CheckIfMovieHasBazookaOrNot(
    private val repository: IRepository
) {
    fun execute(movieTitle: String): Boolean? {
        val answer: Boolean? = try {
            val movie: Movie = getMovie(movieTitle)

            movie.hasBazooka
        } catch (e: MovieNotFoundException) {
            Log.e(TAG, e.message)

            null
        }

        return answer
    }

    private fun getMovie(title: String): Movie {
        val language = getAppLanguage()
        val movieTitleList: List<MovieTitle> = repository.getMovieTitlesListIn(language)

        try {
            val result = movieTitleList.first {
                it.titleMatches(title)
            }

            return repository.getMovieById(result.movieId)
        } catch (e: NoSuchElementException) {
            val message = "Movie $title not found in database."

            Log.e(TAG, "$e: $message")

            throw MovieNotFoundException("Movie $title not found in database.")
        }
    }

    companion object {
        val TAG: String = CheckIfMovieHasBazookaOrNot::class.java.simpleName
    }
}