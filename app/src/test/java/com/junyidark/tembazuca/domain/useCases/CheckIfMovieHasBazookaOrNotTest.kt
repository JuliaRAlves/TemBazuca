package com.junyidark.tembazuca.domain.useCases

import com.junyidark.tembazuca.data.IApi
import com.junyidark.tembazuca.data.Repository
import com.junyidark.tembazuca.data.api.ApiMock
import com.junyidark.tembazuca.domain.interfaces.IRepository
import org.junit.Test

class CheckIfMovieHasBazookaOrNotTest {
    private val dataAccess: IApi = ApiMock()
    private val repository: IRepository = Repository(dataAccess)
    private val checkIfMovieHasBazookaOrNot = CheckIfMovieHasBazookaOrNot(repository)

    @Test
    fun `assert movie exist in database`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Kick-Ass")

        assert(movieHasBazookaOrNot != null)
    }

    @Test
    fun `assert movie doesn't exist in database`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Eragon")

        assert(movieHasBazookaOrNot == null)
    }

    @Test
    fun `assert movie has bazooka`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Kick-Ass")

        assert(movieHasBazookaOrNot == true)
    }

    @Test
    fun `assert movie doesn't has bazooka`() {
        val movieHasBazookaOrNot = checkIfMovieHasBazookaOrNot.execute("Xuxa e os duendes")

        assert(movieHasBazookaOrNot == false)
    }
}