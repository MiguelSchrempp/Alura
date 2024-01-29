package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.model.Usuario
import br.miguel.schrempp.forum.service.UsuarioService
import org.springframework.stereotype.Service

@Service
class UsuarioServiceImpl(var usuarios: List<Usuario>) : UsuarioService {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "Ana@email.com"
        )
        usuarios = arrayListOf(usuario)
    }

    override fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { usuario ->
            usuario.id == id
        }.findFirst().get()
    }
}