package br.miguel.schrempp.forum.impl

import br.miguel.schrempp.forum.dto.NovoTopicoDto
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.service.UsuarioService
import br.miguel.schrempp.forum.service.CursoService
import br.miguel.schrempp.forum.service.TopicoService
import org.springframework.stereotype.Service

@Service
class TopicoServiceImpl(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) : TopicoService {

    override fun listar(): List<Topico> {
        return topicos
    }

    override fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { topico ->
            topico.id == id
        }.findFirst().get()
    }

    override fun cadastrar(dto: NovoTopicoDto) {
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