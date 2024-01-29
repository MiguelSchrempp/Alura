package br.miguel.schrempp.forum.mapper

import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.service.CursoService
import br.miguel.schrempp.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoRequestMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) : Mapper<NovoTopicoRequest, Topico> {
    override fun toMap(t: NovoTopicoRequest): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }

}
