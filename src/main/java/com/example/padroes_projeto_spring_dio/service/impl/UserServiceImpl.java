package com.example.padroes_projeto_spring_dio.service.impl;

import com.example.padroes_projeto_spring_dio.model.User;
import com.example.padroes_projeto_spring_dio.repository.UserRepository;
import com.example.padroes_projeto_spring_dio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private UserRepository userRepository;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<User> buscarTodos() {
        // Buscar todos os Clientes.
        return userRepository.findAll();
    }

    @Override
    public User buscarPorId(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public void inserir(User user) {
        salvarUser(user);
    }

    @Override
    public void atualizar(Long id, User cliente) {
        Optional<User> userBd = userRepository.findById(id);
        if (userBd.isPresent()) {
            salvarUser(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        userRepository.deleteById(id);
    }

    private void salvarUser(User user) {
        userRepository.save(user);
    }
}
