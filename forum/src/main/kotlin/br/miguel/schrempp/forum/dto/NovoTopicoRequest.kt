package br.miguel.schrempp.forum.dto

data class NovoTopicoRequest(
    val titulo: String,
    val mensagem: String,
    val idCurso: Long,
    val idAutor: Long
)
