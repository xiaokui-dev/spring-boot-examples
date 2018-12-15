package example.jpa.service;

import example.jpa.domain.User;

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
