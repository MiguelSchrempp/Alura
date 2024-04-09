package br.miguel.schrempp.forum.repository

import br.miguel.schrempp.forum.model.Usuario
import org.springframework.data.mongodb.repository.MongoRepository

interface UsuarioRepository : MongoRepository<Usuario, Long>