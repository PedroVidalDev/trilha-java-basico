package com.pedro.sant.service.impl;

public interface ServiceImpl<T> {
    Iterable<T> buscarTodos();

    T buscarPorId(Long id);
    void inserir(T t);
    void atualizar(Long id, T t);
    void deletar(Long id);
}
