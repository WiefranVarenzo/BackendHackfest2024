package com.example.createmission

data class User(
    val name: String = "",
    val berikan_komentar: String = "",
    val harga: String = ""
) {
    constructor() : this("", "", "")
}

