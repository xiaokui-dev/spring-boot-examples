package org.xiaokui.springboot.jpa.domain;


import org.springframework.data.repository.CrudRepository;

/**
 * @author xiaokui
 * @Description:UserRepository
 * @date 2018-04-09 18:49
 */
public interface UserRepository extends CrudRepository<User,Long> {

}
