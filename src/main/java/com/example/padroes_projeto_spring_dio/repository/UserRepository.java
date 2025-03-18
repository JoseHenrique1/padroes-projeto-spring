package com.example.padroes_projeto_spring_dio.repository;

import com.example.padroes_projeto_spring_dio.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
