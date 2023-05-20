package com.mejia.service;

import com.mejia.model.Role;
import com.mejia.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    void changeRole(Role newRole, String username);


    User findByUsernameReturnToken(String username);
}
