package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.exception.NotFoundException
import br.miguel.schrempp.forum.model.Curso
import br.miguel.schrempp.forum.repository.CursoRepository
import br.miguel.schrempp.forum.service.CursoService
import org.springframework.stereotype.Service

@Service
class CursoServiceImpl(
    private val cursoRepository: CursoRepository
) : CursoService {

    override fun buscarPorId(id: Long): Curso {
        return cursoRepository.findById(id).orElseThrow{ NotFoundException(NOT_FOUND_MESSAGE) }
    }

    companion object {
        private const val NOT_FOUND_MESSAGE: String = "Curso não encontrado"
    }
}