package org.xiaokui.springboot.mybatis.mapper;

import org.springframework.stereotype.Component;
import org.xiaokui.springboot.mybatis.common.MyMapper;
import org.xiaokui.springboot.mybatis.domain.Country;
@Component
public interface CountryMapper extends MyMapper<Country> {
}