package example.mybatis.service;

import example.mybatis.domain.User;

import java.util.List;

/**
 * @author xiaokui
 * @Description:UsesrService接口
 * @date 2018-04-02 16:54
 */
public interface UserService {

    int add(User user);

    int update(User user);

    int deleteById(Long id);

    List<User> getAll();

    User getUserById(Long id);

    User findUserById(Long id);

}
