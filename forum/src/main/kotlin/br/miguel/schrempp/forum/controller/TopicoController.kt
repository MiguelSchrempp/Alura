package br.miguel.schrempp.forum.controller

import br.miguel.schrempp.forum.dto.AttTopicoRequest
import br.miguel.schrempp.forum.dto.NovoTopicoRequest
import br.miguel.schrempp.forum.dto.TopicoResponse
import br.miguel.schrempp.forum.service.TopicoService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

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
    @Transactional
    fun cadastrar(
        @RequestBody @Valid dto: NovoTopicoRequest,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<TopicoResponse> {
        val topicoResponse = topicoService.cadastrar(dto)
        val uri = uriBuilder.path("/topicos/${topicoResponse.id}").build().toUri()
        return ResponseEntity.created(uri).body(topicoResponse)
    }

    @PutMapping
    @Transactional
    fun atualizar(@RequestBody @Valid attTopicoRequest: AttTopicoRequest): ResponseEntity<TopicoResponse> {
        val topicoResponse = topicoService.atualizar(attTopicoRequest)
        return ResponseEntity.ok(topicoResponse)
    }

    @DeleteMapping
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@RequestParam id: Long) {
        topicoService.deletar(id)
    }

}