package br.com.renan.api.services;

import br.com.renan.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
