package br.miguel.schrempp.forum.service

import br.miguel.schrempp.forum.model.Usuario

interface UsuarioService {
    fun buscarPorId(id: Long): Usuario
}