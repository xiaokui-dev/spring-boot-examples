package example.actuator.service;

import example.actuator.domin.UserInfo;

import java.util.List;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
public interface UserInfoService {

    /**
     * 批量保存
     * @param list list
     */
    void saveBatch(List<UserInfo> list);
}
