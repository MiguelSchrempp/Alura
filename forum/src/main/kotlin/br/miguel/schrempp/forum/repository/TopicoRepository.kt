package br.miguel.schrempp.forum.repository

import br.miguel.schrempp.forum.model.Topico
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.CrudRepository

interface TopicoRepository : MongoRepository<Topico, Long>