package example.actuator.service.impl;

import example.actuator.service.MeterRegistryService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.Map;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2020-09-21
 */
@Service
@Slf4j
public class MeterRegistryServiceImpl implements MeterRegistryService {


    @Resource
    private MeterRegistry meterRegistry;

    /**
     * 统计耗时
     * @param tags 标签 key = 标签名 value = 标签值
     * @param tableName 表名
     * @param costMillis 耗时
     */
    @Override
    public void statisticsTime(String tableName,Map<String,String> tags,long costMillis){
        Duration duration = Duration.ofMillis(costMillis);
        Timer.Builder builder = Timer.builder(tableName);
        for (Map.Entry<String,String> entry : tags.entrySet()) {
            builder.tags(entry.getKey(), entry.getValue());
        }
        Timer timer = builder.register(meterRegistry);
        timer.record(duration);
    }

    @Override
    public void statisticsCount(String tableName, Map<String, String> tags, long count) {
        Counter.Builder builder = Counter.builder(tableName);
        for (Map.Entry<String,String> entry : tags.entrySet()) {
            builder.tags(entry.getKey(), entry.getValue());
        }
        Counter counter = builder.register(meterRegistry);
        counter.increment(count);
    }
}
