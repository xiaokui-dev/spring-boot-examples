package example.mybatis.mapper;

import org.springframework.stereotype.Component;
import example.mybatis.domain.User;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-02 18:22
 */
@Component
public interface UserMapper2 {

    User findUserById(Long id);
}
