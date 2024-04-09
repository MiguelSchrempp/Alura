package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.exception.NotFoundException
import br.miguel.schrempp.forum.model.Usuario
import br.miguel.schrempp.forum.repository.UsuarioRepository
import br.miguel.schrempp.forum.service.UsuarioService
import org.springframework.stereotype.Service

@Service
class UsuarioServiceImpl(
    private val usuarioRepository: UsuarioRepository
) : UsuarioService {

    override fun buscarPorId(id: Long): Usuario {
        return usuarioRepository.findById(id).orElseThrow{ NotFoundException(NOT_FOUND_MESSAGE) }
    }

    companion object {
        private const val NOT_FOUND_MESSAGE: String = "Usuário não encontrado"
    }
}