package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.service.UsuarioService
import br.miguel.schrempp.forum.service.CursoService
import br.miguel.schrempp.forum.service.TopicoService
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoServiceImpl(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) : TopicoService {

    override fun listar(): List<TopicoResponse> {
        return topicos.stream().map {
            topico -> TopicoResponse(
                id = topico.id,
                titulo = topico.titulo,
                mensagem = topico.mensagem,
                dataCriacao = topico.dataCriacao,
                status = topico.status
            )
        }.collect(Collectors.toList())
    }

    override fun buscarPorId(id: Long): TopicoResponse {
        val topico =  topicos.stream().filter { topico ->
            topico.id == id
        }.findFirst().get()

        return TopicoResponse(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            dataCriacao = topico.dataCriacao,
            status = topico.status
        )
    }

    override fun cadastrar(dto: NovoTopicoRequest) {
        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(dto.idCurso),
            autor = usuarioService.buscarPorId(dto.idAutor)
            )
        )
    }


}