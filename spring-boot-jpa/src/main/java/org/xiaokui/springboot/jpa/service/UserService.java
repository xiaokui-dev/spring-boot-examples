package org.xiaokui.springboot.jpa.service;

import org.xiaokui.springboot.jpa.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * @author xiaokui
 * @Description:UserService
 * @date 2018-04-09 18:50
 */
public interface UserService {

    Iterable<User> findAll();

    void saveUser(User user);

    Optional<User> findUserById(Long id);
}
