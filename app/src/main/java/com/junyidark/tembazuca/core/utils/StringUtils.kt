package com.junyidark.tembazuca.core.utils

import java.text.Normalizer

internal fun String.unaccented(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return REGEX_UNACCENT.replace(temp, "")
}

private val REGEX_UNACCENT = "\\p{InCombiningDiacriticalMarks}+".toRegex()