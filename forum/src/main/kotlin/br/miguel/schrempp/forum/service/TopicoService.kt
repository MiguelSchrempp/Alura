package br.miguel.schrempp.forum.service

import br.miguel.schrempp.forum.dto.NovoTopicoDto
import br.miguel.schrempp.forum.model.Topico


interface TopicoService {
    fun listar(): List<Topico>
    fun buscarPorId(id: Long): Topico
    fun cadastrar(dto: NovoTopicoDto)
}