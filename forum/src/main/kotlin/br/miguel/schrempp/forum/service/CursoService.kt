package br.miguel.schrempp.forum.service

import br.miguel.schrempp.forum.model.Curso
import br.miguel.schrempp.forum.model.Topico

interface CursoService {
    fun buscarPorId(id: Long): Curso
}
