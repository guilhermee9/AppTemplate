package com.guilhermegoncalves.appteste.baseclasses

data class Usuario(
    var key: String? = null,
    var nome: String? = null,
    var email: String? = null,
    var password: String? = null,
    val imageUrl: String = ""
)
