package br.com.caio.dio.service;

import br.com.caio.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
