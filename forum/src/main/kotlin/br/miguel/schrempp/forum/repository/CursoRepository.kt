package br.miguel.schrempp.forum.repository

import br.miguel.schrempp.forum.model.Curso
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.CrudRepository

interface CursoRepository : MongoRepository<Curso, Long>