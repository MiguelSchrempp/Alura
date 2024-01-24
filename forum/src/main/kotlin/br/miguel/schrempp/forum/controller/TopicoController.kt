package br.miguel.schrempp.forum.controller

import br.miguel.schrempp.forum.dto.NovoTopicoDto
import br.miguel.schrempp.forum.model.Topico
import br.miguel.schrempp.forum.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(val topicoService: TopicoService) {

    @GetMapping()
    fun listar(): List<Topico> {
        return topicoService.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return topicoService.buscarPorId(id)
    }

    @PostMapping()
    fun cadastrar(@RequestBody dto: NovoTopicoDto) {
        topicoService.cadastrar(dto)
    }

}