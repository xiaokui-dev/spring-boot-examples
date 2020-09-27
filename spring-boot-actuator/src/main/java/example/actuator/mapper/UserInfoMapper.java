package example.actuator.mapper;

import example.actuator.domin.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description : 用户信息
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 批量保存
     * @param list list
     */
    void saveBatch(@Param(value = "list") List<UserInfo> list);
}
