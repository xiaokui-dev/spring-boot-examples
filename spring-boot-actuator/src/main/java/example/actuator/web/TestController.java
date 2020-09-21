package example.actuator.web;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import example.actuator.domin.UserInfo;
import example.actuator.service.MeterRegistryService;
import example.actuator.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Description: test controller
 *
 * @author : xiaokui
 * @date : 2020-09-19
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private UserInfoService userInfoService;

    @Resource
    private MeterRegistryService meterRegistryService;

    @GetMapping(value = "/save")
    public String get(){
        long startTime = System.currentTimeMillis();
        List<UserInfo> list = Lists.newArrayList();
        for (long i = 0; i < 100; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setDistinctId(UUID.randomUUID().toString().replace("-",""));
            userInfo.setUserId(i);
            userInfo.setName("测试" + i);
            if(i % 3 == 0){
                userInfo.setSex(1);
            }else{
                userInfo.setSex(0);
            }
            userInfo.setMobile("13800000000");
            userInfo.setRemark("remark" + i);
            list.add(userInfo);
        }
        for (List<UserInfo> subList : Lists.partition(list,1000)) {
            userInfoService.saveBatch(subList);
        }
        meterRegistryService.statisticsTime("test",Maps.newHashMap(),System.currentTimeMillis() - startTime);
        meterRegistryService.statisticsCount("test_count",Maps.newHashMap(),list.size());
        return "成功";
    }
}
