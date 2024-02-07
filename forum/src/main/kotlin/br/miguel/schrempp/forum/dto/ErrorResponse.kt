package br.miguel.schrempp.forum.dto

import java.time.LocalDateTime

data class ErrorResponse(
    val timeStamp: LocalDateTime = LocalDateTime.now(),
    val status: Int,
    val error: String,
    val message: String?,
    val path: String
)