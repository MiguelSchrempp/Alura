package br.miguel.schrempp.forum.controller

import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.service.TopicoService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(
    val topicoService: TopicoService
) {

    @GetMapping()
    fun listar(): List<TopicoResponse> {
        return topicoService.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoResponse {
        return topicoService.buscarPorId(id)
    }

    @PostMapping()
    fun cadastrar(@RequestBody @Valid dto: NovoTopicoRequest) {
        topicoService.cadastrar(dto)
    }

}