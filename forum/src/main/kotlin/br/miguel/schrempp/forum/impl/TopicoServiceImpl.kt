package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.mapper.TopicoRequestMapper
import br.miguel.schrempp.forum.mapper.TopicoResponseMapper
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.service.TopicoService
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoServiceImpl(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoRequestMapper: TopicoRequestMapper,
    private val topicoResponseMapper: TopicoResponseMapper
) : TopicoService {

    override fun listar(): List<TopicoResponse> {
        return topicos.stream().map { topico ->
            topicoResponseMapper.toMap(topico)
        }.collect(Collectors.toList())
    }

    override fun buscarPorId(id: Long): TopicoResponse {
        val topico = topicos.stream().filter { topico ->
            topico.id == id
        }.findFirst().get()

        return topicoResponseMapper.toMap(topico)
    }

    override fun cadastrar(dto: NovoTopicoRequest) {
        val topico = topicoRequestMapper.toMap(dto)

        topicos = topicos.plus(topico.copy(
            id = topicos.size.toLong() + 1
        ))
    }


}