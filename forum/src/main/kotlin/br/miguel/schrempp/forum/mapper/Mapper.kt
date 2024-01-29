package br.miguel.schrempp.forum.mapper

interface Mapper<T, U> {
    fun toMap(t: T): U
}
