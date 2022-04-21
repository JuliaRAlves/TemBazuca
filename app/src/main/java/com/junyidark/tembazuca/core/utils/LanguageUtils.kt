package com.junyidark.tembazuca.core.utils

import com.junyidark.tembazuca.core.enums.Language
import java.util.*

internal fun getAppLanguage(): Language {
    val appLanguage = Locale.getDefault().language

    return Language.values().first {
        it.toString().lowercase() == appLanguage
    }
}