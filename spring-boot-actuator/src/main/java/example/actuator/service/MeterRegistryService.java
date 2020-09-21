package example.actuator.service;

import io.micrometer.core.instrument.Counter;

import java.util.Map;

/**
 * Description : 统计
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
public interface MeterRegistryService {


    /**
     * 统计耗时
     * @param tags 标签 key = 标签名 value = 标签值
     * @param tableName 表名
     * @param costMillis 耗时
     */
    void statisticsTime(String tableName, Map<String,String> tags, long costMillis);


    /**
     * 统计次数
     * @param tableName 表名
     * @param tags 标签 key = 标签名 value = 标签值
     * @param count 次数
     */
    void statisticsCount(String tableName,Map<String,String> tags, long count);
}
