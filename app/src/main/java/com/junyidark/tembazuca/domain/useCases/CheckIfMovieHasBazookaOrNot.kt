package com.junyidark.tembazuca.domain.useCases

import com.junyidark.tembazuca.core.Log
import com.junyidark.tembazuca.core.exceptions.MovieNotFoundException
import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.interfaces.IRepository

class CheckIfMovieHasBazookaOrNot(
    private val repository: IRepository
) {
    fun execute(movieName: String): Boolean? {
        val answer: Boolean? = try {
            val movieList: List<Movie> = repository.getMovieList()
            val movie: Movie = getMovie(movieName, movieList)

            movie.hasBazooka()
        } catch (e: MovieNotFoundException) {
            Log.e(TAG, e.message)

            null
        }

        return answer
    }

    private fun getMovie(name: String, list: List<Movie>): Movie {
        list.forEach {
            if (it.isNamed(name)) {
                return it
            }
        }

        throw MovieNotFoundException("Movie $name not found in database.")
    }

    companion object {
        val TAG: String = CheckIfMovieHasBazookaOrNot::class.java.simpleName
    }
}