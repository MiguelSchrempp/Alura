package br.miguel.schrempp.forum.dto

import br.miguel.schrempp.forum.model.StatusTopico
import java.time.LocalDateTime

data class TopicoResponse(
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
)
