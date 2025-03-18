package com.example.padroes_projeto_spring_dio.service;

import com.example.padroes_projeto_spring_dio.model.User;

public interface UserService {
    Iterable<User> buscarTodos();

    User buscarPorId(Long id);

    void inserir(User user);

    void atualizar(Long id, User user);

    void deletar(Long id);
}
