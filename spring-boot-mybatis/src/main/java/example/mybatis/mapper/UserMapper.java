package example.mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import example.mybatis.domain.User;

import java.util.List;

/**
 * @author xiaokui
 * @Description:UserMapper
 * @date 2018-04-02 16:44
 */
@Component //Component注解不添加也没事，只是不加service那边引入UserMapper会有错误提示，但不影响
public interface UserMapper {

    @Insert("insert into t_user(user_name,user_password,user_description,gmt_create) values(#{userName},#{userPassword},#{userDescription},now())")
    int add(User user);

    @Update("update t_user set user_name=#{userName},user_password=#{userPassword},user_description=#{userDescription} where id = #{id}")
    int update(User user);

    @Delete("delete from t_user where id = #{id}")
    int deleteById(Long id);

    @Select("select id,user_name as userName,user_description as userDescription,gmt_create as gmtCreate from t_user ")
    List<User> getAll();

    @Select("select id,user_name as userName ,user_description as userDescription,gmt_create as gmtCreate from t_user where id = #{id}")
    User getUserById(Long id);
}
