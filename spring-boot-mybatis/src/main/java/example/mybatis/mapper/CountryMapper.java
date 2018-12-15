package example.mybatis.mapper;

import org.springframework.stereotype.Component;
import example.mybatis.common.MyMapper;
import example.mybatis.domain.Country;
@Component
public interface CountryMapper extends MyMapper<Country> {
}