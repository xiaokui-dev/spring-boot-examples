package example.actuator.service.impl;

import example.actuator.domin.UserInfo;
import example.actuator.mapper.UserInfoMapper;
import example.actuator.service.UserInfoService;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description : 实现类
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public void saveBatch(List<UserInfo> list) {
        userInfoMapper.saveBatch(list);
    }
}
