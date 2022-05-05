package com.junyidark.tembazuca.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.junyidark.tembazuca.core.enums.Language
import com.junyidark.tembazuca.core.utils.getAppLanguage
import com.junyidark.tembazuca.data.Repository
import com.junyidark.tembazuca.domain.entities.Answer
import com.junyidark.tembazuca.domain.entities.Movie
import com.junyidark.tembazuca.domain.entities.MovieTitle

class HomeViewModel(private val repository: Repository) : ViewModel() {
    private val mutableMovieListForLanguage = MutableLiveData<List<MovieTitle>>()
    val movieListForLanguage: LiveData<List<MovieTitle>> = mutableMovieListForLanguage

    private val mutableSelectedMovie = MutableLiveData<Movie>()
    val selectedMovie: LiveData<Movie> = mutableSelectedMovie

    private val mutableAnswer = MutableLiveData<Answer>()
    val answer: LiveData<Answer> = mutableAnswer

    suspend fun fetchMovieListForLanguage() {
        val language: Language = getAppLanguage()

        val movieList = repository.getMovieTitlesListIn(language)

        mutableMovieListForLanguage.postValue(movieList)
    }

    suspend fun search(query: String) {

    }
}