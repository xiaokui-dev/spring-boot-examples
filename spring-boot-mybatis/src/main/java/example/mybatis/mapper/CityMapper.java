package example.mybatis.mapper;

import org.springframework.stereotype.Component;
import example.mybatis.common.MyMapper;
import example.mybatis.domain.City;
@Component
public interface CityMapper extends MyMapper<City> {
}