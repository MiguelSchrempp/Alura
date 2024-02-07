package br.miguel.schrempp.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NovoTopicoRequest(
    @field:NotEmpty(message = "Título não pode estar vazio")
    @field:Size(min = 5, max = 100, message = "Título deve conter de 5 a 100 caracteres")
    val titulo: String,
    @field:NotEmpty(message = "Mensagem não pode estar vazia")
    val mensagem: String,
    @field:NotNull(message = "Id do curso não pode ser nulo")
    val idCurso: Long,
    @field:NotNull(message = "Id do autor não pode ser nulo")
    val idAutor: Long
)
