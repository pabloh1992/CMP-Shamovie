package com.pablodev.shamovie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform