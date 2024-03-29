package br.miguel.schrempp.forum.mapper

import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.model.Topico
import org.springframework.stereotype.Component

@Component
class TopicoResponseMapper : Mapper<Topico, TopicoResponse> {
    override fun toMap(t: Topico): TopicoResponse {
        return TopicoResponse(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            dataCriacao = t.dataCriacao,
            status = t.status
        )
    }
}