package example.jpa.service;

import example.jpa.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.jpa.domain.User;

import java.util.Optional;

/**
 * @author xiaokui
 * @Description:UserService实现类
 * @date 2018-04-09 18:52
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public void saveUser(User user) {
         userRepository.save(user);
    }

    @Override
    public Optional<User> findUserById(Long id){
       return userRepository.findById(id);

    }
}
