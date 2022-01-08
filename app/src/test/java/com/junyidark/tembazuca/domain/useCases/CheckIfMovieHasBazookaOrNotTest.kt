package com.junyidark.tembazuca.domain.useCases

import com.junyidark.tembazuca.data.IApi
import com.junyidark.tembazuca.data.Repository
import com.junyidark.tembazuca.data.api.Api
import com.junyidark.tembazuca.domain.interfaces.IRepository
import org.junit.Test

class CheckIfMovieHasBazookaOrNotTest {
    private val dataAccess: IApi = Api()
    private val repository: IRepository = Repository(dataAccess)
    private val checkIfMovieHasBazookaOrNot = CheckIfMovieHasBazookaOrNot(repository)

    @Test
    fun assertMovieExistInDatabase() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Kick-Ass")

        assert(movieHasBazookaOrNot != null)
    }

    @Test
    fun `assertMovieDoesn'tExistInDatabase`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Xuxa e os Duendes")

        assert(movieHasBazookaOrNot == null)
    }

    @Test
    fun assertMovieHasBazooka() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Kick-Ass")

        assert(movieHasBazookaOrNot == true)
    }

    @Test
    fun `assertMovieDoesn'tHasBazooka`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Eragon")

        assert(movieHasBazookaOrNot == false)
    }
}