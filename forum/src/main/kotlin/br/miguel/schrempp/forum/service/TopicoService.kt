package br.miguel.schrempp.forum.service

import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse


interface TopicoService {
    fun listar(): List<TopicoResponse>
    fun buscarPorId(id: Long): TopicoResponse
    fun cadastrar(dto: NovoTopicoRequest)
}