package br.miguel.schrempp.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class AttTopicoRequest(
    @field:NotNull
    val id: Long,
    @field:Size(min = 5, max = 100)
    @field:NotEmpty
    val titulo: String,
    @field:Size(min = 5, max = 255)
    @field:NotEmpty
    val mensagem: String
)
