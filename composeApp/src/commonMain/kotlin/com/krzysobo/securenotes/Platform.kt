package com.krzysobo.securenotes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
