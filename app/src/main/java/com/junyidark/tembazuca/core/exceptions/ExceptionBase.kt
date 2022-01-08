package com.junyidark.tembazuca.core.exceptions

open class ExceptionBase(override val message: String) : Exception() {
    override fun getLocalizedMessage(): String {
        return message
    }
}