package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.dto.AttTopicoRequest
import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.exception.NotFoundException
import br.miguel.schrempp.forum.mapper.TopicoRequestMapper
import br.miguel.schrempp.forum.mapper.TopicoResponseMapper
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.repository.TopicoRepository
import br.miguel.schrempp.forum.service.TopicoService
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoServiceImpl(
    private val topicoRepository: TopicoRepository,
    private val topicoRequestMapper: TopicoRequestMapper,
    private val topicoResponseMapper: TopicoResponseMapper
) : TopicoService {

    override fun listar(): List<TopicoResponse> {
        return topicoRepository.findAll().map { topico ->
            topicoResponseMapper.toMap(topico)
        }
    }

    override fun buscarPorId(id: Long): TopicoResponse {
        val topico = topicoRepository.findById(id).stream().filter { topico ->
            topico.id == id
        }.findFirst().orElseThrow{NotFoundException(NOT_FOUND_MESSAGE)}

        return topicoResponseMapper.toMap(topico)
    }

    override fun cadastrar(dto: NovoTopicoRequest): TopicoResponse {
        val topico = topicoRequestMapper.toMap(dto)
        topicoRepository.save(topico)
        return topicoResponseMapper.toMap(topico)
    }

    override fun atualizar(attTopicoRequest: AttTopicoRequest): TopicoResponse {
        val topico = topicoRepository.findById(attTopicoRequest.id).orElseThrow {
            NotFoundException(NOT_FOUND_MESSAGE)
        }

        val topicoAtualizado = topicoRepository.save(
            topico.copy(
                titulo = attTopicoRequest.titulo,
                mensagem = attTopicoRequest.mensagem
            )
        )

        return topicoResponseMapper.toMap(topicoAtualizado)
    }

    override fun deletar(id: Long) {
        topicoRepository.deleteById(id)
    }


    companion object {
        private const val NOT_FOUND_MESSAGE: String = "Tópico não encontrado"
    }
}