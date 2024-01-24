package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.model.Curso
import br.miguel.schrempp.forum.service.CursoService
import org.springframework.stereotype.Service

@Service
class CursoServiceImpl(var cursos: List<Curso>) : CursoService {

    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programação"
        )
        cursos = arrayListOf(curso)
    }

    override fun buscarPorId(id: Long): Curso {
        return cursos.stream().filter { curso ->
            curso.id == id
        }.findFirst().get()
    }
}